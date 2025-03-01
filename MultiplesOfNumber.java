// Creating Class with name MultiplesOfNumber to find all multiples of a number below 100
import java.util.Scanner;

class MultiplesOfNumber {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a positive integer less than 100: ");
                int number = input.nextInt();

                // Check if the number is a positive integer and less than 100
                if (number < 1 || number >= 100) {
                        System.out.printf("The number %d is not within the valid range (1-99).\n", number);
                } else {
                        System.out.printf("The multiples of %d below 100 are: ", number);

                        // Loop from 100 to 1 in reverse order
                        for (int i = 100; i >= 1; i--) {
                                if (i % number == 0) { // Check if i is a multiple of number
                                        System.out.print(i + " "); // Print the multiple
                                }
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
