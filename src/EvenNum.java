
public class EvenNum
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		  EvenNum obj = new EvenNum(); // creating object to class
		obj.oddNumEx1(); //calling method
		int i;
		System.out.println("Even numbers");
		   for(i=1;i<=100;i++) 
		   {
			  if(i%2==0) // writing logic for even numbers
			     System.out.print(i + " "); 
		   }
		   System.out.println();
   
		
	}
		

	  public void oddNumEx1()
	  {
	   int num;
	   System.out.println("odd numbers");
	
     	for(num=1;num<=100;num++)
      	 {
	      	if(num %2!=0)  // writing logic for Odd numbers
		     {
			 System.out.print(num + " ");
		     }
	      	
			
	      }
 	   System.out.println();
	  }


}
