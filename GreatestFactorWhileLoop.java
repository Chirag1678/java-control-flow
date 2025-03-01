// Creating Class with name GreatestFactorWhileLoop to find the greatest factor of a number besides itself using while loop
import java.util.Scanner;

class GreatestFactorWhileLoop {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is a positive integer greater than 1
                if (number < 2) {
                        System.out.printf("The number %d does not have a valid greatest factor.\n", number);
                } else {
                        // Define greatestFactor variable and initialize to 1
                        int greatestFactor = 1;

                        // Initialize counter variable
                        int counter = number - 1;

                        // Loop from number - 1 down to 1
                        while (counter >= 1) {
                                if (number % counter == 0) { // Check if counter is a factor
                                        greatestFactor = counter;
                                        break; // Stop at the first (largest) factor found
                                }
                                counter--; // Decrement counter
                        }

                        // Display the result
                        System.out.printf("The greatest factor of %d besides itself is: %d\n", number, greatestFactor);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
