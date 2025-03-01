// Creating Class with name NumberChecker to check if a number is positive, negative, or zero
import java.util.Scanner;

class NumberChecker {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a number: ");
                int number = input.nextInt();

                // Check if the number is positive, negative, or zero
                if (number > 0) {
                        System.out.printf("The number %d is positive.\n", number);
                } 
                else if (number < 0) {
                        System.out.printf("The number %d is negative.\n", number);
                } 
                else {
                        System.out.println("The number is zero.");
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
