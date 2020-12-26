package com.BasicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int rev,sum=0,temp;
		int n=124;
		
		temp=n;
		while(n>0) {
		rev=n%10;	//at the start rev==4
		sum=(sum*10)+rev;
		n=n/10; 	//at the start n become 12
		}
		if(temp==sum)
		{
			System.out.println("It's palindrome");
		}
		else 
		{
			System.out.println("Not a palindrome");
		}
	}

}
