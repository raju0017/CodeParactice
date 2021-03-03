package _01com.nag.basicConnections;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer sid;
	private String sname;
	private String semail;
	private Integer smarks;

	public Student() {
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public Integer getSmarks() {
		return smarks;
	}

	public void setSmarks(Integer smarks) {
		this.smarks = smarks;
	}
}
