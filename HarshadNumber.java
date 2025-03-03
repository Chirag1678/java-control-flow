// Creating Class with name HarshadNumber to determine if a given number is a Harshad Number
import java.util.Scanner;

class HarshadNumber {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Store the original number for later comparison
                int originalNumber = number;
                int sum = 0; // Variable to store sum of digits

                // Use while loop to extract and sum up the digits
                while (number > 0) {
                        int digit = number % 10; // Extract last digit
                        sum += digit; // Add digit to sum
                        number /= 10; // Remove last digit
                }

                // Check if the original number is divisible by sum of its digits
                if (originalNumber % sum == 0) {
                        System.out.printf("The number %d is a Harshad Number.\n", originalNumber);
                } else {
                        System.out.printf("The number %d is not a Harshad Number.\n", originalNumber);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
