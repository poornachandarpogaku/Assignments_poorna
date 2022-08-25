package assignments;

 class A { // class A
	 int num =10;  // instace variable
	public void methodOne()
	{
		System.out.println("method One");
	}
}
 class B
 {
	  A a; // creating  refference variable as instance variable to class A.
	  
	 public void methodTwo()
	 {
		 a = new A(); // creating object to class A.
		 a.methodOne(); //calling method One 
		 System.out.println("from method Two");
		 System.out.println("num = " + a.num);
	 }
 }
 


public class AbEx1{

	public static void main(String[] args)
	{
		AbEx1 obj = new AbEx1(); // creating Object to Main class
		System.out.println("main method");
		
	B b = new B(); // creating Object to Class B.
	b.methodTwo(); // calling method Two.
	}

}

