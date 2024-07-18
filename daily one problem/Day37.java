import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();

		//int SI = (int)((principal*rate*time)/100);

		System.out.println((int)((principal*rate*time)/100));
		
	}
}