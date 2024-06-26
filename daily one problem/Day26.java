import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		for(int i=0; i<n; i++){
		    m[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int[] result = new int[n+2];
		result[0] = x;
		for(int i=0; i<n; i++){
		    result[i+1] = m[i];
		}
		
		result[n+1] = x;
		
		for(int i=0; i<result.length; i++){
		    System.out.print(result[i]+" ");
		}
		sc.close();
	}
}

