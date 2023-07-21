package com.digit.testProj.Multithreading;

import java.util.Scanner;
//singlethreading
public class Program1 {
public static void main(String[] args) throws InterruptedException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Banking started");
	System.out.println("Enter the accno:");
	int accno=sc.nextInt();
	System.out.println("Enter the pin:");
	int pin=sc.nextInt();
	System.out.println("Banking completed");
	System.out.println("Printing started");
	for(int i=0;i<=5;i++) {
		System.out.println("hii good morning");
		Thread.sleep(3000);
	}
	System.out.println("printing completed");
	System.out.println("Addition operation");
	System.out.println("Enter the num1:");
	int num1=sc.nextInt();
	System.out.println("Enter the num2:");
	int num2=sc.nextInt();
	int res=num1+num2;
	System.out.println("The result:"+ res);
	System.out.println("Addition completed");
}
}
