// Creating Class with name MultiplicationTable to print the table from 6 to 9
import java.util.Scanner;

class MultiplicationTable {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for number
                System.out.print("Enter a number: ");
                int number = input.nextInt();

                // Print the multiplication table from 6 to 9
                for (int i = 6; i <= 9; i++) {
                        System.out.printf("%d * %d = %d\n", number, i, number * i);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
