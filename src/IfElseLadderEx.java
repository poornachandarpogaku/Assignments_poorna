/*write a java program to take 3 subject marks, find total, average and result.
 * 
i. if average greater than or equal to 75  -  first class with distinction
ii. if average less than 75 and greater than equal to 65  -   first class
iii. if average less than 65 and greater than equal to 55  -  second class
iv. if average less than 55 and greater than equal to 45  -  third class
v. if average less than 45 - failed*/

public class IfElseLadderEx {

	public static void main(String[] args) {
	
float subject1,subject2,subject3,total,average;
    subject1 = 88;
    subject2 = 82;
    subject3 = 78;

total = subject1+subject2+subject3;
System.out.println("total marks = " +total);

average = total/3;
System.out.println("average marks = " + average);
   if(average>=75)
   {
	   System.out.println("result : first class with distinction");
   }
   else if(average<75 && average >=65)
   {
	   System.out.println("result : first class");
   }
   else if (average<65 && average>=55)
   {
	   System.out.println("result : second class");
   }
   else if(average<55 && average>=45)
   {
	   System.out.println("result : third class");
   }
   else 
   {
	   System.out.println("result : failed");
   }
	}

}
