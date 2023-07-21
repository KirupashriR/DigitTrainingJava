package com.digit.testProj.ExceptionHandling;

import java.util.Scanner;
//Rethrow the exception
class Operation{
	void function1() throws ArithmeticException{
		try {
		System.out.println("Inside func1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int num=sc.nextInt();
		System.out.println("Enter the denominator:");
		int den=sc.nextInt();
		int res=num/den;
		System.out.println("result:" + res);
		}
		catch(Exception e) {
			System.out.println("Exception handled by func1");
			throw e;
		}
		finally {
		System.out.println("left func1");
		}
	}
}
public class Program3 {
	public static void main(String[] args){
		try {
		System.out.println("Inside main");
		Operation op=new Operation();
		op.function1();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled by main");
		}
		finally {
		System.out.println("left main");
		}
	}
}
