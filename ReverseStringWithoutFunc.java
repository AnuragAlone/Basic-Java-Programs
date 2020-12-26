package com.BasicPrograms;

import java.util.Scanner;

public class ReverseStringWithoutFunc {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String==");
		s=sc.nextLine();
		System.out.println("After the reversal==");
		for(int i=s.length();i>0;--i) {
			System.out.print(s.charAt(i-1));
		}
		
	}

}
