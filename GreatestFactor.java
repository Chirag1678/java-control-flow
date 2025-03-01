// Creating Class with name GreatestFactor to find the greatest factor of a number besides itself
import java.util.Scanner;

class GreatestFactor {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is a positive integer
                if (number < 2) {
                        System.out.printf("The number %d does not have a valid greatest factor.\n", number);
                } else {
                        // Define greatestFactor variable and initialize to 1
                        int greatestFactor = 1;

                        // Loop from number - 1 down to 1
                        for (int i = number - 1; i >= 1; i--) {
                                if (number % i == 0) { // Check if i is a factor
                                        greatestFactor = i;
                                        break; // Stop at the first (largest) factor found
                                }
                        }

                        // Display the result
                        System.out.printf("The greatest factor of %d besides itself is: %d\n", number, greatestFactor);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
