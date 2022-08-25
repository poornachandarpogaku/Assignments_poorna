package controlstatements;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100;
int b=120;
int c=160;
   if(a>b)
       {
	   if(a>c)
		 System.out.println("biggest number is a = " + a);  
	   else
		   System.out.println("biggest number is c = " + c);
       }
   else
      {
	   if(b>c) 
		  System.out.println("biggest number is b = " + b); 
	   else
		System.out.println("biggest number is c = " + c);   
      }
 }

}
