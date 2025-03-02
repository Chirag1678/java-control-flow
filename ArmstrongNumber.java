// Creating Class with name ArmstrongNumber to determine if a given number is an Armstrong number
import java.util.Scanner;

class ArmstrongNumber {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Define variables
                int sum = 0; // Variable to store the sum of cubes of digits
                int originalNumber = number; // Store the original number to compare later

                // Use while loop till originalNumber is not equal to 0
                while (originalNumber != 0) {
                        // Extract the last digit using modulus operation
                        int digit = originalNumber % 10;

                        // Compute the cube of the digit and add it to sum
                        sum += digit * digit * digit;

                        // Remove the last digit from the originalNumber
                        originalNumber /= 10;
                }

                // Check if sum is equal to the original number
                if (sum == number) {
                        System.out.printf("The number %d is an Armstrong Number.\n", number);
                } else {
                        System.out.printf("The number %d is not an Armstrong Number.\n", number);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
