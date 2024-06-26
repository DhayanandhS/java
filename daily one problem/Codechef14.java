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
		
		//System.out.print(m[0]+" ");
		
		for(int i=0; i<n; i+=2){
		    System.out.print(m[i]+" ");
		}
	}
}
