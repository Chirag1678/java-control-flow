// Creating Class with name CanVote to check if a person can vote based on age
import java.util.Scanner;

class CanVote {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for age
                System.out.print("Enter the person's age: ");
                int age = input.nextInt();

                // Check for invalid (negative) age
                if (age < 0) {
                        System.out.printf("The entered age %d is invalid. Please enter a valid age.\n", age);
                }
                // Check if the person is eligible to vote
                else if (age >= 18) {
                        System.out.printf("The person's age is %d and can vote.\n", age);
                } 
                // If age is below 18, the person cannot vote
                else {
                        System.out.printf("The person's age is %d and cannot vote.\n", age);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
