// Creating Class with name DivisibleByFive to check if a number is divisible by 5 or not
import java.util.Scanner;

class DivisibleByFive{
	public static void main(String[] args){
		// Create a Scanner Object to take user input
		Scanner input = new Scanner(System.in);

		// Get input value for a number
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		// Check if the number is divisible by 5 or not, ( == for compare)
		if( number < 0 ){
			System.out.print("Enter a valid number");
		}
		else if( number % 5 == 0 ) {
			System.out.printf("Is the number %d divisible by 5? Yes", number);
		
		}
		else {
			System.out.printf("Is the number %d divisible by 5? No", number);
		}

		// Close the Scanner object to avoid resource leakage
		input.close();
	}
}
