import java.util.ArrayList;
import java.util.List;
class ArmstrongNumbers {

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, n = 0;
        double result = 0.0;

        originalNum = num;

        // store the number of digits of num in n
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // compute result
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // check if num is equal to the result
        if ((int)result == num)
            return true;
        else
            return false;
    }

    public static List<Integer> findArmstrongNumbers(int start, int end) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int num = start; num <= end; ++num) {
            if (isArmstrong(num))
                armstrongNumbers.add(num);
        }
        return armstrongNumbers;
    }

    public static void main(String[] args) {
        int start, end;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        end = scanner.nextInt();

        List<Integer> armstrongNumbers = findArmstrongNumbers(start, end);

        System.out.print("Armstrong numbers between " + start + " and " + end + " are: ");
        for (int num : armstrongNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

