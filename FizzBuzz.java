// Creating Class with name FizzBuzz to print numbers with FizzBuzz logic
import java.util.Scanner;

class FizzBuzz {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer: ");
                int number = input.nextInt();

                // Check if the number is a positive integer
                if (number < 1) {
                        System.out.printf("The number %d is not a positive integer.\n", number);
                } else {
                        // Loop from 1 to the entered number
                        for (int i = 1; i <= number; i++) {
                                if (i % 3 == 0 && i % 5 == 0) {
                                        System.out.println("FizzBuzz"); // Multiple of both 3 and 5
                                } else if (i % 3 == 0) {
                                        System.out.println("Fizz"); // Multiple of 3
                                } else if (i % 5 == 0) {
                                        System.out.println("Buzz"); // Multiple of 5
                                } else {
                                        System.out.println(i); // Print the number
                                }
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
