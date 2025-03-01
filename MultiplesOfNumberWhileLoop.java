// Creating Class with name MultiplesOfNumberWhileLoop to find all multiples of a number below 100 using while loop
import java.util.Scanner;

class MultiplesOfNumberWhileLoop {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer less than 100: ");
                int number = input.nextInt();

                // Check if the number is a positive integer and less than 100
                if (number < 1 || number >= 100) {
                        System.out.printf("The number %d is not within the valid range (1-99).\n", number);
                } else {
                        System.out.printf("The multiples of %d below 100 are: ", number);

                        // Initialize counter variable
                        int counter = 100;

                        // Loop while counter is greater than 1
                        while (counter > 1) {
                                if (counter % number == 0) { // Check if counter is a multiple of number
                                        System.out.print(counter + " "); // Print the multiple
                                }
                                counter--; // Decrement counter
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
