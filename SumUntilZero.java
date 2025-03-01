// Creating Class with name SumUntilZero to find the sum of numbers until user enters 0
import java.util.Scanner;

class SumUntilZero {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Declare a variable to store the sum (initialize to 0.0)
                double total = 0.0;

                // Declare a variable to store user input
                double number;

                // Start the loop
                System.out.print("Enter a number (Enter 0 to stop): ");
                number = input.nextDouble();

                while (number != 0) {
                        // Add the entered number to the total sum
                        total += number;

                        // Ask for next input
                        System.out.print("Enter a number (Enter 0 to stop): ");
                        number = input.nextDouble();
                }

                // Display the final sum
                System.out.printf("The total sum is: %.2f\n", total);

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
