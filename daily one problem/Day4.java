import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit2 = scanner.nextDouble();
                double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius2);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
