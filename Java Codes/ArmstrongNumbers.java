import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumbers {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;   // Extract last digit
            sum += digit * digit * digit;  // Cube the digit and add to sum
            num /= 10;   // Remove last digit
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        // Prompt user for input
        System.out.print("Enter the ending range: ");

        // Validate user input
        if (scanner.hasNextInt()) {
            int range = scanner.nextInt();

            if (range < 0) {
                System.out.println("Please enter a positive number.");
            } else {
                // Find Armstrong numbers in the given range
                for (int i = 0; i <= range; i++) {
                    if (isArmstrong(i)) {
                        armstrongNumbers.add(i);
                    }
                }

                // Display the Armstrong numbers
                System.out.println("Armstrong numbers from 0 to " + range + ": " + armstrongNumbers);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}
