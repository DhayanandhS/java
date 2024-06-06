import java.util.Scanner;

class Day11
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
