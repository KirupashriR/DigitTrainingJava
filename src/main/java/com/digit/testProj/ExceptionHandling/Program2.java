package com.digit.testProj.ExceptionHandling;

import java.util.Scanner;
//ducking the exception
class Operations{
	void function1() throws Exception{
		System.out.println("Inside func1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int num=sc.nextInt();
		System.out.println("Enter the denominator:");
		int den=sc.nextInt();
		int res=num/den;
		System.out.println("result:" + res);
		System.out.println("left func1");
	}
	void function2() throws Exception{
		System.out.println("Inside func2");
		function1();
		System.out.println("left func2");
	}
	void function3(){
		try {
		System.out.println("Inside func3");
		function2();
		}
		catch(Exception e) {
			System.out.println("Exception handled");

		}
		System.out.println("left func3");
	}
}
public class Program2 {
	public static void main(String[] args){
		System.out.println("Inside main");
		Operations op=new Operations();
		op.function3();
		System.out.println("left main");
	}
}
