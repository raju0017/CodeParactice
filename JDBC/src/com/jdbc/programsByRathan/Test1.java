package com.jdbc.programsByRathan;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args)
	{ 
	Scanner s=new Scanner(System.in); //used to take dynamic input from keyboard
	
	System.out.println("enter emp hobbies");
	String ehobbies = s.nextLine();
	System.out.println("enter emp no");
	int eno=s.nextInt();
	System.out.println("enter emp name");
	String ename=s.next();
	System.out.println("enter emp salary");
	float esal=s.nextFloat();
	
	System.out.println("*****emp details*****");
	
	System.out.println("emp no----->"+eno);
	System.out.println("emp name---->"+ename);
	System.out.println("emp sal------>"+esal);
	System.out.println("emp hobbies------>"+ehobbies);
	s.close(); //used to close the stream
	}

}
