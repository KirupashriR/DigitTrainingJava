package com.digit.testProj.ExceptionHandling;

import java.util.Scanner;
//try with multiple catch
public class Program1 {
public static void main(String[] args) {
	//try with resources
	try(Scanner sc=new Scanner(System.in)){
	//Scanner sc=new Scanner(System.in);
	System.out.println("Division operation");
	System.out.println("Enter the numerator:");
	int num=sc.nextInt();
	System.out.println("Enter the denominator:");
	int den=sc.nextInt();
	int res=num/den;
	System.out.println("result:" + res);
	System.out.println("Array operation");
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the position to add:");
	int pos=sc.nextInt();
	System.out.println("enter the value:");
	int val=sc.nextInt();
	arr[pos]=val;
	System.out.println("Data added to the array");
	}
	//specific catch
	catch(ArithmeticException e1) {
		System.out.println("ArithmeticException");
	}
	catch(NegativeArraySizeException| ArrayIndexOutOfBoundsException e2) {
		System.out.println("Array related exception");
	}
	/*catch(ArrayIndexOutOfBoundsException e3) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	catch (InputMismatchException  e4) {
		System.out.println("InputMismatchException");
	}*/
	catch(NullPointerException e5) {
		System.out.println("NullPointerException");
	}
	//generic catcher
	catch(Exception e) {
		System.out.println("Exception handled by generic catch");
	}
}
}
