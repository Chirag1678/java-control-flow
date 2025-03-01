// Creating Class with name NaturalNumberChecker to check if a number is natural and find the sum of n natural numbers
import java.util.Scanner;

class NaturalNumberChecker {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for a number
                System.out.print("Enter a number: ");
                int number = input.nextInt();

                // Check if the number is a natural number (positive integer)
                if (number > 0) {
                        // Calculate the sum of n natural numbers using formula: n * (n + 1) / 2
                        int sum = number * (number + 1) / 2;
                        System.out.printf("The sum of %d natural numbers is %d\n", number, sum);
                } else {
                        System.out.printf("The number %d is not a natural number\n", number);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
