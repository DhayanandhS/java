import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    System.out.println(isValid(N, K) ? "YES" : "NO");
		}
		sc.close();
	}
	public static boolean isValid(int N, int K){
	    int minLength = K * (K+1)/2;
	    if (minLength > N) return false;
        int minSeparators = K - 1;
        int totalMinRequiredLength = minLength + minSeparators;
        return totalMinRequiredLength <= N;
	}
}
