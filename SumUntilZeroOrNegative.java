// Creating Class with name SumUntilZeroOrNegative to find the sum of numbers until user enters 0 or a negative number
import java.util.Scanner;

class SumUntilZeroOrNegative {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Declare a variable to store the sum (initialize to 0.0)
                double total = 0.0;

                // Start an infinite while loop
                while (true) {
                        // Prompt user for input
                        System.out.print("Enter a number (Enter 0 or a negative number to stop): ");
                        double number = input.nextDouble();

                        // Check if the number is 0 or negative, then break the loop
                        if (number <= 0) {
                                break;
                        }

                        // Add the entered number to the total sum
                        total += number;
                }

                // Display the final sum
                System.out.printf("The total sum is: %.2f\n", total);

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
