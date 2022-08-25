package controlstatements;


/* write a java program to take an amount and check if amount is greater than or equal to 
 10 thousand give 20% discount or else 5% discount.*/

public class DiscountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     	 float amount = 12000.0f,discount,afterDiscount;
     	 
		    System.out.println("original price : RS." + amount );
		     
		     
     	 if (amount>=10000)
     	 {
     		 discount = amount*20/100;
     		 afterDiscount = amount-discount;
     		  System.out.println("discount 20% : RS."+ discount);
     		  System.out.println("After discount : RS." +afterDiscount);		 
     	 }
     	 else
     	 {
     		 discount = amount*5/100;
     		 afterDiscount = amount - discount;
     		 System.out.println("discount 5% : RS."+discount );
     		 System.out.println("After discount : RS." + afterDiscount);
     	 }
     	   
        }

	

}
