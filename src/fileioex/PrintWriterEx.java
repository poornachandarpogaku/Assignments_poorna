package fileioex;

import java.io.*;

public class PrintWriterEx {

	public static void main(String[] args)  throws IOException 
	{
		
   PrintWriter pw = new PrintWriter("C:\\JavaWorkSpace\\raghava.txt");

pw.println(200);


pw.flush();
pw.close();
System.out.println("succesfully written, check data in your file");

	}

}
 