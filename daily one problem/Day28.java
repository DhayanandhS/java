import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int t = 3; 

        for (int i = 0; i < t; i++) 
        {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            computeValue(A, B);
        }
        scanner.close();
    }

    // User-defined method to compute and print values
    public static void computeValue(int a, int b) 
    {
        System.out.println((a*a)+(2*a*b)+(b*b));
        System.out.println(a+b);

	}
}

