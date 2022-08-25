package ArraysEx;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");   // initializing values from userInpur or Scanner
		
		int[] num = new int[5];
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
		sc.close();
		for(int j:num)
		{
			System.out.println(j);    //accesing all elements in Array
		}
	}

}
