/*Task 7:
Search : Index Number ExampleArray
Monday Tuesday January Orange user give any word find the index 
 alpha, no numbers
 StringIndesArray
 AA AB AC AD MA IndexNumber
 MO 13
 ZZ

*/
package assignments;
import java.util.*;
public class IndexNumberExample {

	public static void main(String[] args) {
		
		String[] words = new String[676];  
		int n=0;
		
		for(char i='a';i<='z';i++)      
		{                                 
			for(char k='a';k<='z';k++)    
			{
			words[n] =i+""+k;
		     n++;
		    } 
	     }
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word:");
		String input = sc.next().substring(0,2);   
		sc.close();
		
		for(int num=0;num<words.length;num++) 
		{
			if(input.equalsIgnoreCase(words[num])==true)  
			{                                                
		     System.out.println("index number of "+"\""+input+"\""+" is "+num);
		     break;
		    }
		 }
	}
}
