// Creating Class with name RocketLaunchForLoop to perform a countdown using for loop
import java.util.Scanner;

class RocketLaunchForLoop {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for the countdown
                System.out.print("Enter the countdown start value: ");
                int counter = input.nextInt();

                // Countdown loop using for-loop
                for (int i = counter; i >= 1; i--) {
                        System.out.println(i);
                }

                // Print launch message after countdown
                System.out.println("Liftoff!");

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
