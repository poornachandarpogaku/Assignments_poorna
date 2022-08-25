package assignments;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentance:");
		String input = sc.nextLine(); //apple is good for  health
	    
		
		String words[] = input.split(" "); //apple
		
	    for(int k=0;k<words.length;k++)
		{
	    	String s="";
	    	int i=0;
	    	 s=words[k]; //apple
	    	for(int j=0;j<s.length();j++)
	    	{
		      i=i+s.codePointAt(j);  // 97
	    	}
		 System.out.print(i);
		}
	}

}
