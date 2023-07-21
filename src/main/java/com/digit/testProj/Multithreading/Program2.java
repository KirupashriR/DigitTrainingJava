package com.digit.testProj.Multithreading;

import java.util.Scanner;
//multithreading
class Banking extends Thread{
	//abstract method
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking started");
		System.out.println("Enter the accno:");
		int accno=sc.nextInt();
		System.out.println("Enter the pin:");
		int pin=sc.nextInt();
		System.out.println("Banking completed");
	}
}
class Printing extends Thread{
	public void run() {
		System.out.println("Printing started");
		for(int i=0;i<=5;i++) {
			try {
				System.out.println("hii good morning");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("printing completed");
	}
}
class Add extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
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
public class Program2 {
	public static void main(String[] args) {
		System.out.println("Main started");
		Banking b=new Banking();
		Printing p=new Printing();
		Add a=new Add();
		b.start();
		p.start();
		a.start();
		System.out.println("Main completed");
	}
}
