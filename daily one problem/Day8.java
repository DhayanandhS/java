import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		 Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
		if (n == 1 || n == 2) {
                System.out.println("1");
        }
		
        else{
			int a = 1, b = 1;
        int fib = 1;
			for (int i = 3; i <= n; i++) {
			
            fib = a + b;
            a = b;
            b = fib;
        }
        System.out.println(fib);
		}
		
	}

}