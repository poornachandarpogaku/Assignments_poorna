package assignments;
import java.util.*;
  public class ReverseWordsInStringAtSamePosition {
	
   	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence:");    
		   String userInput = sc.nextLine(); 
		   
		   String words[] = userInput.split(" ");    
		   String output = ""; 
		
		         for(int i=0;i<words.length;i++) 
		         {
		            output = output+reverse(words[i]); 
		            if (i!=words.length-1)
		        	    output=output+" ";
		         }
		         System.out.println(output);
		         sc.close();
	} 
	public static String reverse(String input)
	{
		String reverse="";  
		for(int i=input.length()-1;i>=0;i--) 
		{
		  reverse = reverse + input.charAt(i);  
		}
		return reverse;
	}
}                                                           
	
	
	


