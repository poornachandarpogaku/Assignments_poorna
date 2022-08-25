package assignments;
import java.io.*;
import java.util.Scanner;

public class EmployeeDataDecrypt {

	public static void main(String[] args)  throws IOException {
				
				FileReader fr = new FileReader("C:\\JavaWorkSpace\\empEncy1.txt");
				BufferedReader br = new BufferedReader(fr);
				
				PrintWriter pw = new PrintWriter("C:\\JavaWorkSpace\\empDecy.txt");
				
				Scanner sc = new Scanner(br);
				while (sc.hasNextLine()) 
				{
				String input=sc.nextLine();
				char[] s1=input.toCharArray(); //a
				char ch;
				String output= "";
				int key=-10; //alphabet+1
				
				    for(int i=0;i<s1.length;i++) 
				    {
				       ch =  s1[i]; //a
				       if(ch!=32)   // 32 is ASCII value for ' 'space.
				       {
				       ch = (char) (ch+key);  //a+1=b
				       output =output+ ch;  //b
				       }
				       else
				       {
				       ch = (char) (ch);
				       output = output+ch;
				       }
				    }
				    
				    pw.println(output); //it is write the data into file
				    
				}
				System.out.println("data decrypted, check your file");
					br.close();
					sc.close();
					fr.close();
			        pw.flush();
			        pw.close();
			        sc.close();
			}

	




	}


