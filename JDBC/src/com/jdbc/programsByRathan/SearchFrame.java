package com.jdbc.programsByRathan;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class SearchFrame extends Frame implements ActionListener{
	Label l;
	TextField tf;
	Button b;
	Connection con;
	Statement st;
	ResultSet rs;
	SearchFrame()
	{
	try
	{
	this.setVisible(true);
	this.setSize(500,400);
	this.setBackground(Color.pink);
	this.setTitle("JDBC - AWT Application");
	this.setLayout(new FlowLayout());
	l=new Label("productId");
	tf=new TextField(15);
	b=new Button("Search");
	b.addActionListener(this);
	this.add(l);
	this.add(tf);
	this.add(b);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.14:1521:orcl","hr","hr");
	st=con.createStatement();
	}
	catch (Exception e)
	{e.printStackTrace();}
	}
	public void actionPerformed(ActionEvent ae)
	{try
	{rs=st.executeQuery("select * from emp where eno='"+tf.getText()+"'");
	repaint();
	}
	catch (Exception e)
	{e.printStackTrace();}
	}public void paint(Graphics g)
	{
		try
		{
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);
		boolean b=rs.next();
		if(b==true)
		{
		g.drawString("emp id....."+rs.getInt(1),50,100);
		g.drawString("emp Name....."+rs.getString(2),50,150);
		g.drawString("emp sal....."+rs.getInt(3),50,200);
		}
		else
		{
		g.drawString("emp does not exists",50,150);
		}
		}
		catch (Exception e)
		{ e.printStackTrace(); }
		}
		
		
		

}
