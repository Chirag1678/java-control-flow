// Creating Class with name NaturalNumberSumForLoop to compute sum using both for loop and formula
import java.util.Scanner;

class NaturalNumberSumForLoop {
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

                        // Compute sum using for loop
                        int sumForLoop = 0;
                        for (int i = 1; i <= n; i++) {
                                sumForLoop += i;
                        }

                        // Compare and display results
                        System.out.printf("Sum using formula: %d\n", sumFormula);
                        System.out.printf("Sum using for loop: %d\n", sumForLoop);

                        if (sumFormula == sumForLoop) {
                                System.out.println("Both computations match!");
                        } else {
                                System.out.println("There is an error in computation!");
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
