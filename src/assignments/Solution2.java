package assignments;
import java.util.*;

/* Sample Input:
      42
      3.1415
      Welcome to HackerRank's Java tutorials!
   Sample Output:
      String: Welcome to HackerRank's Java tutorials!
      Double: 3.1415
      Int: 42
 */

public class Solution2 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
     System.out.println("enter a integer value:");
      int i = sc.nextInt();
     System.out.println("enter a Double i value:");
       double d = sc.nextDouble();
     System.out.println("enter a sentence:");
       String s1 = sc.nextLine();
       String s = sc.nextLine();
       
    
       
       System.out.println("String: " + s);
       System.out.println("Double: " + d);
     System.out.println("int: " + i);
      
	}

}
