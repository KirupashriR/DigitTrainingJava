package com.digit.testProj.ExceptionHandling;

import java.util.Scanner;
//Custom exception with nested try-catch
class UnderAgeException extends Exception{
	public String getMessage() {
		return "your age is less than 18";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "your age is more than 60";
	}
}
//RTO
class Candidates{
	int age;
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		age=sc.nextInt();
	}
	void verify() throws Exception{
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("Issue the insurance");
		}
	}
}
class RTOs{
	void grantLicense(Candidates c) {
		try {
			c.getData();
			c.verify();//cc
		}
		catch(Exception e1) {
			try {
				c.getData();
				c.verify();//cc
			}
			catch(Exception e2) {
				try {
					c.getData();
					c.verify();//cc
				}
				catch(Exception e) {
					System.out.println("Exception handled");
				}
			}	
		}
	}
}
public class Program5 {
	public static void main(String[] args) {
		Candidates c1=new Candidates();
		RTOs rto=new RTOs();
		rto.grantLicense(c1);
	}
}
