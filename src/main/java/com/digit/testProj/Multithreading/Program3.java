package com.digit.testProj.Multithreading;
import java.util.Scanner;
//multithreading using implements runnable
class Bankings implements Runnable{
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
class Printings implements Runnable{
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
class Addition implements Runnable{
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
public class Program3 {
	public static void main(String[] args) {
		System.out.println("Main started");
		Bankings b=new Bankings();
		Printings p=new Printings();
		Addition a=new Addition();
		Thread t1=new Thread(b);
		Thread t2=new Thread(p);
		Thread t3=new Thread(a);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main completed");
	}
}
