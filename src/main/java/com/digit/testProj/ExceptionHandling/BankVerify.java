package com.digit.testProj.ExceptionHandling;

import java.util.Scanner;
//Custom exception with nested try-catch
class IncorrectException extends Exception{
	public String getMessage() {
		return "acc and pin is wrong";
	}
}
//RTO
class Person{
	int accno;
	int pin;
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accno:");
		accno=sc.nextInt();
		System.out.println("Enter the pin:");
		pin=sc.nextInt();
	}
	void verify() throws Exception{
		if(accno!=111 && pin!=11) {
			IncorrectException ie=new IncorrectException();
			System.out.println(ie.getMessage());
			throw ie;
		}
		else {
			System.out.println("verified");
		}
	}
}
class Bank{
	void grantAccess(Person c) {
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
					System.out.println("user not found");
				}
			}	
		}
	}
}
public class BankVerify {
	public static void main(String[] args) {
		Person c1=new Person();
		Bank b=new Bank();


	
	}
}
