
class B
{
void show() 
{
	System.out.println("class B");
}	
}

public class A extends B
{
public static void main(String[] args) 
{
A obj = new A();
obj.show();
}
@Override
void show()
{
System.out.println("class A");
}

}
