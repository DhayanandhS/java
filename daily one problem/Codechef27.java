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
		    
		    int b1 = sc.nextInt();
		    int b2 = sc.nextInt();
		    int b3 = sc.nextInt();
		    
		    if( b1 == 1 && b2 == 1 && b3 == 1 ){
		        System.out.println("Not now");
		    }
		    else if( (b1 == 1 && b2 == 1) || (b2 == 1 && b3 == 1) || (b1 == 1 && b3 == 1)){
		        System.out.println("Not now");
		    }
		    else{
		        System.out.println("Water filling time");
		    }
		}

	}
}