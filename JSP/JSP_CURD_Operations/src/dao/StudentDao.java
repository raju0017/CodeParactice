package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Student;

public class StudentDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static int save(Student s) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into register(name,password,email,sex,country) values(?,?,?,?,?)");
			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getSex());
			ps.setString(5, s.getCountry());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int update(Student s) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con
					.prepareStatement("update register set name=?,password=?,email=?,sex=?,country=? where id=?");
			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getSex());
			ps.setString(5, s.getCountry());
			ps.setInt(6, s.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static int delete(Student s) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from register where id=?");
			ps.setInt(1, s.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static List<Student> getAllRecords() {
		List<Student> list = new ArrayList<Student>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from register");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setPassword(rs.getString("password"));
				s.setEmail(rs.getString("email"));
				s.setSex(rs.getString("sex"));
				s.setCountry(rs.getString("country"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Student getRecordById(int id) {
		Student s = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from register where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setPassword(rs.getString("password"));
				s.setEmail(rs.getString("email"));
				s.setSex(rs.getString("sex"));
				s.setCountry(rs.getString("country"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

}
