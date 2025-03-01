// Creating Class with name NaturalNumberSum to compute sum using both while loop and formula
import java.util.Scanner;

class NaturalNumberSum {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a natural number (positive integer): ");
                int n = input.nextInt();

                // Check if the number is a natural number (positive integer)
                if (n <= 0) {
                        System.out.printf("The number %d is not a natural number.\n", n);
                } else {
                        // Compute sum using formula: n * (n + 1) / 2
                        int sumFormula = n * (n + 1) / 2;

                        // Compute sum using while loop
                        int sumWhileLoop = 0;
                        int counter = 1;
                        while (counter <= n) {
                                sumWhileLoop += counter;
                                counter++;
                        }

                        // Compare and display results
                        System.out.printf("Sum using formula: %d\n", sumFormula);
                        System.out.printf("Sum using while loop: %d\n", sumWhileLoop);

                        if (sumFormula == sumWhileLoop) {
                                System.out.println("Both computations match!");
                        } else {
                                System.out.println("There is an error in computation!");
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
