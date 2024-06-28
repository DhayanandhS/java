import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// first Array
		int[] a = new int[n];
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt();
		}
		
		//second Array
		int[] b = new int[m];
		for(int i=0; i<m; i++){
		    b[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
		    System.out.print(a[i]+" ");
		}
		for(int i=0; i<m; i++){
		    System.out.print(b[i]+" ");
		}
		for(int i=0; i<n; i++){
		    System.out.print(a[i]+" ");
		}
	}
}
