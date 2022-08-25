
public class InterfaceTest  {

	public static void main(String[] args) {
		
		One o = new One();
		o.methodOne();
		o.methodTwo();
		System.out.println(MyInter.i);
		
		// TODO Auto-generated method stub
	}
}
 class One implements MyInter
{
public  void methodOne()
{
	System.out.println("class one method one");
	System.out.println(i);
	}

public void methodTwo()
{
System.out.println("class one method Two");	
}


	

}
