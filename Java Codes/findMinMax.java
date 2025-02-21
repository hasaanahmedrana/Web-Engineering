import java.util.Scanner; // Importing Scanner class

public class findMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for input

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); // Taking the size of the array from the user

        int[] numbers = new int[size]; // Creating an array with the given size

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) { // Loop to take array input
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0]; // Assume first element is the maximum
        int min = numbers[0]; // Assume first element is the minimum

        for (int i = 1; i < size; i++) { // Loop through the array to find max and min
            if (numbers[i] > max) { 
                max = numbers[i]; // Update max if current number is larger
            }
            if (numbers[i] < min) { 
                min = numbers[i]; // Update min if current number is smaller
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close(); // Close scanner to avoid resource leak
    }
}
