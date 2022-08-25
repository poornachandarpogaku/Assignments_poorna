package assignments;

import java.util.Scanner; 

public class EncryptAndDecrypt {

	public static void main(String[] args) {

		    EncryptAndDecrypt obj = new EncryptAndDecrypt();
		    obj.encrypt();
		    System.out.println();
		    obj.decrypt();	    
     }
	
	public void encrypt()   
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentance:");
		String input=sc.nextLine(); 
		
		char[] s1=input.toCharArray(); //a
		char ch;
		String output= "";
		int key=1; //alphabet+1
		 System.out.print("encrypt form:");
		 
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
		    System.out.print(output);
		
	}
	
	public void decrypt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentance:");
		String input=sc.nextLine();
		
		char[] s2=input.toCharArray(); //b
		char ch;
		String output= "";
		int key=-1; //alphabet-1
		 System.out.print("decrypt form:");
		 
		 for(int i=0;i<s2.length;i++) 
		    {
		    ch =  s2[i]; //b
		    if(ch!=' ')
		    {
		     ch = (char) (ch+key);  //b+(-1) =b-1 =a
		    output =output+ ch;
		    }
		    else
		    {
		    	output = output+" ";
		    }
		    }
		    System.out.println(output);
	}
	
	
}

