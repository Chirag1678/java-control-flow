// Creating Class with name RocketLaunch to perform a countdown using while loop
import java.util.Scanner;

class RocketLaunch {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for the countdown
                System.out.print("Enter the countdown start value: ");
                int counter = input.nextInt();

                // Countdown loop
                while (counter >= 1) {
                        System.out.println(counter);
                        counter--; // Decrement the counter
                }

                // Print launch message after countdown
                System.out.println("Liftoff!");

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
