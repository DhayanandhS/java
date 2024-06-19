import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int temp = 0;
		for(int i=1; i<=x; i++){
		    if(i%2==0){
		        temp = temp + 1;
		    }
		}
		int working = x - temp;
		System.out.println(working);
	}
}

