// Creating Class with name SmallestNumberChecker to check if the first number is the smallest among three numbers
import java.util.Scanner;

class SmallestNumberChecker {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input values for three numbers
                System.out.print("Enter the first number: ");
                int number1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int number2 = input.nextInt();

                System.out.print("Enter the third number: ");
                int number3 = input.nextInt();

                // Check if the first number is the smallest
                if( number1 < number2 && number1 < number3 ) {
                        System.out.printf("Is the first number the smallest? Yes");
                }
                else {
                        System.out.printf("Is the first number the smallest? No");
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
