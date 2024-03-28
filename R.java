import java.util.*;


public class R
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 int N = s.nextInt(); // Number of rows in the pattern
         // Number of rows in the pattern
        
        for (int i = N; i >= 1; i--) {
            for (int j = N; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print(" ");
                } // Print numbers from 'j' to 'i' in reverse order
            }
            System.out.println(); // Move to the next line after printing the row
        }
	}
}