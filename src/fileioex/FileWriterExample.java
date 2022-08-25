package fileioex;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		
		
		FileWriter fw = new FileWriter("C:\\JavaWorkSpace\\raghava1.txt");
		
		fw.append('a');  //it is write character by character in file
		fw.append('p');
		fw.append('p');
		fw.append('l');
		fw.append('e');    
		fw.append(' ');   
		fw.append('i');
		fw.append('s');
		fw.append(' ');
		fw.append('g');
		fw.append('o');
		fw.append('o');
		fw.append('d');
		
		System.out.println("writen");
		fw.flush();
		fw.close();
	}

}

