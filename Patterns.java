import java.util.*;


public class Patterns
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int N = s.nextInt(); // Number of rows in the pattern
        
        for (int i = 1; i <= N; ++i) {
            for (int j = N; j >= i; --j) {
                System.out.print(j); // Print numbers from 5 to 'i' in reverse order
            }
            System.out.println(); 
            // Move to the next line after printing the row
        }
	}
}
