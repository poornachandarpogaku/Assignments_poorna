package controlstatements;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int i=0;i<=10;i++)
    {
    	if(i==6) 
    	continue; // it skips the next statement
    	System.out.print(i + " ");
    	
    	if(i==8)
    	{
    		break; //its comes out of the loop
    	}
    }
}
	}