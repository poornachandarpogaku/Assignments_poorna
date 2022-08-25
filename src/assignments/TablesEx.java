package assignments;

public class TablesEx {

	public static void main(String[] args) {
    
		int number1 =10;
		int number2 =15;
		
             for(int i=number1;i<=number2;i++)
             {
            	  for(int j=1;j<=10;j++)
            	  {
	              String mul = i+" * "+j+" = "+i*j;    
	              System.out.println(mul);	          
	              }
	              System.out.println("-------------");  
             }
   }
}


