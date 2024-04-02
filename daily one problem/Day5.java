public class Day5 {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
