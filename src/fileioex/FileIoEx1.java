package fileioex;

import java.io.*;

public class FileIoEx1  {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
File f = new File("src");
String[] str =f.list();
for(String s : str)
{
	System.out.println(s);
	}

	}

}
