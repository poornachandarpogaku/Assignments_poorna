
public class Class1 
{   // creating class

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Class1 obj = new Class1(); // creating object
		System.out.println(" \"Creating a class\" and \"Creating an Object\"");
		//obj.method1(); // calling method1.
		//obj.method2();
		obj.datatypes1();
		obj.primeNumberEx();
	}
	
      public void method1()  // creating another method 
	  {
	  System.out.println("from method 1");	
	  }
      
      public void method2()
      {
    	  System.out.println("from method 2");
      }
      public void datatypes1()
      {
    	  int age = 22;
    	  byte b = (byte)age; // converting int to byte
    	  double d = age; //converting int to double
    	  float f = age; //  converting int to float
    	  float percentage = 70.5f;
    	  int i = (int)percentage; // converting float to int
    	  char grade = 'A';
    	  boolean pass = true;
    	  String name = "poornachandar.pogaku";
    	  System.out.println("NAME: " + name);
    	  System.out.println("AGE: " +age);
    	  System.out.println("percentage: " + percentage);
    	  System.out.println("GRADE: " +grade);
    	  System.out.println(name + " is pass? " + pass);
    	  System.out.println(f);
    	  System.out.println(i);
    	  System.out.println(d);
    	  System.out.println(b);
      }
      
      public void primeNumberEx()
      {

      }
	

}