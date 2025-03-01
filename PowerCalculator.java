// Creating Class with name PowerCalculator to find the power of a number
import java.util.Scanner;

class PowerCalculator {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for base number
                System.out.print("Enter the base number (positive integer): ");
                int number = input.nextInt();

                // Get input value for exponent (power)
                System.out.print("Enter the power (non-negative integer): ");
                int power = input.nextInt();

                // Check if inputs are valid
                if (number < 1 || power < 0) {
                        System.out.printf("Invalid input! The base should be a positive integer and power should be non-negative.\n");
                } else {
                        // Initialize result variable to 1
                        int result = 1;

                        // Loop to calculate power
                        for (int i = 1; i <= power; i++) {
                                result *= number;
                        }

                        // Display the result
                        System.out.printf("%d raised to the power %d is: %d", number, power, result);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
