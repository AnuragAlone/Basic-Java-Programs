package com.BasicPrograms;

/*Armstrong Number in Java: A positive number is called armstrong number 
 *if it is equal to the sum of cubes of its digits 
 *for example:
 *	153 = (1*1*1)+(5*5*5)+(3*3*3)  
	where:  
	(1*1*1)=1  
	(5*5*5)=125  
	(3*3*3)=27  
	So:  1+125+27=153  */

public class Armstrng {

	public static void main(String[] args) {
		int c=0,a,temp;
		int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		
			System.out.println("It is armstrong number");
		else
			System.out.println("It is not armstrong number");
		
	}

}
