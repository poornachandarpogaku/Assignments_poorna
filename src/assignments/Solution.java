package assignments;

import java.util.Scanner;


/*---------Task taken from Hacker rank-----------
Given an integer, , perform the following conditional actions:
-> n between 1 to 100 range only.
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5 , print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter an integer: ");
		int N = sc.nextInt();
		sc.close();
	if(1<=N&&N<=100)	
	{	
		if(N%2!=0)
	    {
			System.out.println("Weird");
		}
		else 
		{
		   if(N>=2&&N<=5)
		   {
		   System.out.println("Not Weird");	
		   }
		   else if(N>=6&&N<=20)
		   {
			System.out.println("Weird");
		   }
		   else
		   {
		    System.out.println("Not Weird");
		   }
		}
	}
	else
	{
		System.out.println("enter an Integer between 1 to 100 range olny ");
	}
		
	

  }

}
