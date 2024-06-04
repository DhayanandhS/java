import java.util.Scanner;

class Codechef2
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int N, sum = 0;
        N = scanner.nextInt();
        int i=0;
        while (i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);
	}
}
