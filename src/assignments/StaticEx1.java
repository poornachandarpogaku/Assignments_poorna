package assignments;

public class StaticEx1 {
	
    public static void main (String[] args)  {
		int i = 10;
		System.out.println(i);
		StaticEx1.methodOne(); // we can call methodOne without creating an object, 
		
		StaticEx1 obj = new StaticEx1(); // creating an object.
		obj.methodTwo();
	
	 }
    
	  public static void methodOne()  {
		 int j = 20;
		 System.out.println(j);
	   }
	    void methodTwo() {
	    	int k =30;
	    	System.out.println(k);
	    }


}

