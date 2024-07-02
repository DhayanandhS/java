import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        // accept the count of test cases given in the 1st line
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            // accept 1 integer on the 1st line of each test case
            int n = read.nextInt();
            // output the negative integer - i.e. (-N)
            System.out.println(-n);
        }
	}
}
