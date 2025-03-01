// Creating Class with name LargestNumberChecker to check which number is the largest among three numbers
import java.util.Scanner;

class LargestNumberChecker {
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

                // Check if the first number is the largest
                boolean isFirstLargest = (number1 > number2 && number1 > number3);
                
                // Check if the second number is the largest
                boolean isSecondLargest = (number2 > number1 && number2 > number3);
                
                // Check if the third number is the largest
                boolean isThirdLargest = (number3 > number1 && number3 > number2);

                // Display the result
                System.out.printf("Is the first number the largest? %s\n", isFirstLargest ? "Yes" : "No");
                System.out.printf("Is the second number the largest? %s\n", isSecondLargest ? "Yes" : "No");
                System.out.printf("Is the third number the largest? %s\n", isThirdLargest ? "Yes" : "No");

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
