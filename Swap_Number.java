package com.BasicPrograms;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
		System.out.println("Enter the value of a, b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before Swapping:" +" a= "+a+ " b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: "+" a= "+a+" b= "+b);
	}

}
