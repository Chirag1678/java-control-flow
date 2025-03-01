// Creating Class with name OddEvenNumbers to print odd and even numbers from 1 to user-entered number
import java.util.Scanner;

class OddEvenNumbers {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is a natural number (positive integer)
                if (number < 1) {
                        System.out.printf("The number %d is not a natural number.\n", number);
                } else {
                        // Iterate from 1 to the entered number
                        for (int i = 1; i <= number; i++) {
                                if (i % 2 == 0) {
                                        System.out.printf("%d is an Even number.\n", i);
                                } else {
                                        System.out.printf("%d is an Odd number.\n", i);
                                }
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
