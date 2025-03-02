// Creating Class with name PrimeNumber to determine if a given number is prime
import java.util.Scanner;

class PrimeNumber {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is greater than 1 (since prime numbers are >1)
                if (number <= 1) {
                        System.out.printf("The number %d is not a Prime Number.\n", number);
                } else {
                        // Initialize isPrime to true
                        boolean isPrime = true;

                        // Loop from 2 to number-1 to check divisibility
                        for (int i = 2; i < number; i++) {
                                if (number % i == 0) { // If divisible, not a prime
                                        isPrime = false;
                                        break; // No need to check further
                                }
                        }

                        // Display result based on isPrime value
                        if (isPrime) {
                                System.out.printf("The number %d is a Prime Number.\n", number);
                        } else {
                                System.out.printf("The number %d is not a Prime Number.\n", number);
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
