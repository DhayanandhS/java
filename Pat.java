import java .util.Scanner;
public class Pat {
	public static void main(String args[]) {
        

        // write your code logic !!
		Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // Number of rows in the pattern
        
        for (int i = 0; i < N; i++) {
            // Print numbers for each row
            for (int j = 1; j <= N; j++) {
                int num = (i + j) % N + 1;
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after printing the row
        }

        
	}
}
