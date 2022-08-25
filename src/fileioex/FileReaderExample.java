package fileioex;

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) throws FileNotFoundException   {
		
		
		FileReader fr = new FileReader("C:\\JavaWorkSpace\\Students.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String input = "poornachandar";
		String input1 = "pavan";
		String output="";
		
		
		
		Scanner sc = new Scanner(br);
        
		while(sc.hasNext())
		{
          output=sc.nextLine();
          if(input.equalsIgnoreCase(output)| input1.equalsIgnoreCase(output))
          {
        	System.out.println("\""+output+"\""+ " found in file"); 
        	 break;
          }
         
		}
	
		
	   sc.close();
     
	}

}
