package controlstatements; // package

public class IfExample { // creating class

	public static void main(String[] args) 	{ // Main mthod
		IfExample obj = new IfExample();
		obj.checkEvenOrOdd();
		obj.eligibleForMarriage();
		obj.eligibleForVote();
   	}
	// write a program to check eligible for marriage
	public void eligibleForMarriage()   // another method
	{
		int maleAge = 22;
		int femaleAge =19;
	if (maleAge>=21) {
		System.out.println(" male eligible for marriage");
	}
	else {
		System.out.println(" male not eligible for marriage");
	}
	if(femaleAge>=18) {
		System.out.println(" famale eligible for marriage");
	}
	else {
		System.out.println(" female not eligle for marriage");
	}
	}
	//write a program to check a number even or odd
	public void checkEvenOrOdd()
	{
		int number = 22;
		if (number%2==0)
		{
			System.out.println(number + " is an even number");
		}
		else
		{
			System.out.println(number + "  is an odd number");
		}
	}
	// write a programe to check eligible for vote.
	            public void eligibleForVote()
         	{
		            int age = 19;

		           if (age>=18) {       // if statemet
		        	System.out.println("This person eligible for vote");  
		            }
		           else {  //else statement

			        System.out.println("This person not eligible for vote");
		            }

	}
	           


}
