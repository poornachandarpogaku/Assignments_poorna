package fileioex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadPhoto {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		FileReader fr = new FileReader("C:\\Users\\Admin\\Pictures\\Screenshots\\c.png");
		BufferedReader br = new BufferedReader(fr);
		Scanner sc =new Scanner(br);
		 
		
		
		System.out.println(sc.next());
		

	}

}
