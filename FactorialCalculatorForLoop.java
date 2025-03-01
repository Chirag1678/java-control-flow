// Creating Class with name FactorialCalculatorForLoop to compute factorial using for loop
import java.util.Scanner;

class FactorialCalculatorForLoop {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is a positive integer
                if (number < 0) {
                        System.out.printf("The number %d is not a positive integer.\n", number);
                } else {
                        // Compute factorial using for loop
                        long factorial = 1;
                        for (int i = 1; i <= number; i++) {
                                factorial *= i;
                        }

                        // Display the result
                        System.out.printf("The factorial of %d is %d\n", number, factorial);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
