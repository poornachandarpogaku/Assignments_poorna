
public abstract class AbstractClassTest {
	
	public void methodOne()
	{
		System.out.println("from method One");
	}
	public  void methodTwo()
	{
		System.out.println("from method Two");
	}
	public static void main(String[] args)
	{
		Sub1 s = new Sub1();
		s.methodOne();
	}
	

}
 class Sub1 extends AbstractClassTest
{

public  void methodOne()
{
	System.out.println("from sub class and method one");
}
}
