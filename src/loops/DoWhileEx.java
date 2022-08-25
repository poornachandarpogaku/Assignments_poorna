package loops;

public class DoWhileEx {
	
	//write a java program to display multiplication table of a number.

		public static void main(String[] args) {
			
			int i = 1;
			int j = 1;
			
	    do {
	    	String mul = i+" * "+j+" = "+ i*j;
	    	System.out.println(mul);
	    	j++;
	       }
	    while(j<=10);
	    
		
		}
	}
