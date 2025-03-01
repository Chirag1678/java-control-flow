// Creating Class with name NumberFactorsWhileLoop to find the factors of a given number using while loop
import java.util.Scanner;

class NumberFactorsWhileLoop {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is a positive integer
                if (number < 1) {
                        System.out.printf("The number %d is not a positive integer.\n", number);
                } else {
                        System.out.printf("The factors of %d are: ", number);

                        // Initialize counter variable
                        int i = 1;

                        // Loop till counter is less than or equal to the number
                        while (i <= number) {
                                if (number % i == 0) {
                                        System.out.print(i + " "); // Print the factor
                                }
                                i++; // Increment counter
                        }
                        System.out.println(); // New line for better formatting
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
