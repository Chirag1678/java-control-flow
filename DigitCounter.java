// Creating Class with name DigitCounter to count the number of digits in an integer
import java.util.Scanner;

class DigitCounter {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                // Handle case where number is 0
                if (number == 0) {
                        System.out.println("The number of digits in 0 is: 1");
                } else {
                        // Define variable count to track number of digits
                        int count = 0;
                        int originalNumber = number; // Store the original number for display

                        // Convert negative number to positive for digit counting
                        if (number < 0) {
                                number = -number;
                        }

                        // Use while loop to count digits
                        while (number != 0) {
                                number /= 10; // Remove last digit
                                count++; // Increase count
                        }

                        // Display the result
                        System.out.printf("The number of digits in %d is: %d\n", originalNumber, count);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
