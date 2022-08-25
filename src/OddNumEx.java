
public class OddNumEx
{

	public static void main(String[] args) {
	
	OddNumEx obj1 = new OddNumEx();
	obj1.oddNumEx1();
	}
	void oddNumEx1()
	{
	int num;
	System.out.println("odd numbers");
	
	for(num=1;num<=100;num++)
	 {
		if(num %2!=0)
		{
			System.out.print(num + " ");
		}
			
	 }
	}
	

	

}
