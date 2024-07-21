import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++){
		    
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    int z = n * x;
		    
		    int a= z / 4;
	        if(z % 4 != 0)
	        System.out.println(a+1);
	        else
	        System.out.println(a);
		}

	}
}
