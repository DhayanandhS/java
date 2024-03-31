import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();// Number of terms
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; ++i) {//we can also give i++ in the for loop//
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
