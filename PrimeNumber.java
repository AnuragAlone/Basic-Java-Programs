package com.BasicPrograms;
/*Prime number is a number that is greater than 1 and divided by 1 or itself only. 
 * prime numbers can't be divided by other numbers than itself or 1. 
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */
public class PrimeNumber {

	public static void main(String [] args)
	{
		int i,m=0, flag=0;
		int n=17;
		m=n/2;
		
		if(n==0 || n==1)
		{
			System.out.println(n+" is the not prime number ");
		}
		else 
		{
			for(i=2;i<m;i++) 
			{
				if(n%i==0)
				{
					System.out.println(n+" is not the prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println(n+"  is the prime number");
			}
		}
	}
}
