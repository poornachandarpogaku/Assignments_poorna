package fileioex;

import java.io.*; 
public class FileCreate {

	public static void main(String[] args) throws Exception 
	{
        File fr = new File("C:\\poorna\\chandar");
     
       if(fr.exists())
    	   System.out.println("file already exist");
       else
       {
    	 fr.mkdir();
    	 System.out.println("file created");
       }
       //fr.delete();
	}
}
