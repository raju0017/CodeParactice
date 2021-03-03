package com.jdbc.programsByRathan;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyFrame extends Frame implements ActionListener {
	Button b1, b2;
	Connection con;
	ResultSet rs;
	Statement st;
	String label;

	MyFrame() {
		try {
			this.setVisible(true);
			this.setSize(500, 500);
			this.setBackground(Color.red);
			b1 = new Button("NEXT");
			b2 = new Button("PREVIOUS");
			this.setLayout(new FlowLayout());
			this.add(b1);
			this.add(b2);
			b1.addActionListener(this);
			b2.addActionListener(this);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.19:1521:orcl", "hr", "hr");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from emp");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent e) {
		label = e.getActionCommand();
		repaint();
	}

	public void paint(Graphics g) {
		try {
			if (label.equals("NEXT")) {
				boolean b = rs.next();
				if (b == true) {
					g.drawString("emp number" + rs.getInt(1), 50, 100);
					g.drawString("emp name" + rs.getString(2), 50, 200);
					g.drawString("emp sal" + rs.getInt(3), 50, 300);
				} else {
					g.drawString("no record", 50, 500);
				}
			}
			if (label.equals("PREVIOUS")) {
				boolean b = rs.previous();
				if (b == true) {
					g.drawString("emp number" + rs.getInt(1), 50, 100);
					g.drawString("emp name" + rs.getString(2), 50, 200);
					g.drawString("emp sal" + rs.getInt(3), 50, 300);
				} else {
					g.drawString("no record", 50, 500);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
};
