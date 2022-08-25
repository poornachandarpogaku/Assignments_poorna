package Exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
        try
        {
		  int i = 10/0;
          System.out.println(i);
          System.out.println("try");
        }
        
        catch(Exception e)
        {
          int i=10/1;
          System.out.println(i);
          System.out.println("catch");
        }
        finally
        {
        	
			System.out.println("finally");
		}
         System.out.println("rest of the program");
}
}