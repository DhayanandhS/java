import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        
        // Read the number of stoves (X) and the number of minutes (Y)
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        // Calculate the maximum number of customers Chef can serve
        int maxCustomers = X * Y;
        
        // Print the result
        System.out.println(maxCustomers);

	}
}
