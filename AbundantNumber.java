// Creating Class with name AbundantNumber to determine if a given number is an Abundant Number
import java.util.Scanner;

class AbundantNumber {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Define sum variable to store the sum of divisors
                int sum = 0;

                // Loop through all numbers from 1 to number - 1
                for (int i = 1; i < number; i++) {
                        if (number % i == 0) { // Check if i is a divisor
                                sum += i; // Add divisor to sum
                        }
                }

                // Check if the sum of divisors is greater than the number
                if (sum > number) {
                        System.out.printf("The number %d is an Abundant Number.\n", number);
                } else {
                        System.out.printf("The number %d is not an Abundant Number.\n", number);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
