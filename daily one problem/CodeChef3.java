import java.util.Scanner;

class Codechef3
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int num, count = 0;
        num = scanner.nextInt();

        while (num != 0) {
            num = num/10;
            count++;
            
        }
        System.out.println(count);
	}
}

