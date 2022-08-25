package assignments;

public class FindEachAlphabetCountInString {

	public static void main(String[] args) {
		String str="good morning"; 
		String s=str.toLowerCase();
		char[] s1=s.toCharArray();
		String output = "";
		
		 for(char ch='a';ch<='z';ch++) 
		 { 
		     int count=0; 
		 for(int i=0;i<s1.length;i++) 
		 { 
		    if(ch==s1[i]) 
		    { 
		    count++; 
		    }
		 } 
		    if(count>0) 
		    output = output+ch+"="+count+",";
		  
		 }
		
		 System.out.println(output);
		 
	}

}
