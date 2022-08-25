package assignments;

import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");

        int N = Integer.parseInt(b.readLine().trim());
        for(int i=1;i<=10;i++)
        {
        	int result = N*i;
        	 System.out.println(N+" * "+i+" = "+result);
        }
       

        b.close();
    }
}

