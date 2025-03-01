// Creating Class with name YoungestAndTallestFriend to determine the youngest and tallest friend
import java.util.Scanner;

class YoungestAndTallestFriend {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input values for ages
                System.out.print("Enter the age of Amar: ");
                int ageAmar = input.nextInt();

                System.out.print("Enter the age of Akbar: ");
                int ageAkbar = input.nextInt();

                System.out.print("Enter the age of Anthony: ");
                int ageAnthony = input.nextInt();

                // Get input values for heights
                System.out.print("Enter the height of Amar (in cm): ");
                double heightAmar = input.nextDouble();

                System.out.print("Enter the height of Akbar (in cm): ");
                double heightAkbar = input.nextDouble();

                System.out.print("Enter the height of Anthony (in cm): ");
                double heightAnthony = input.nextDouble();

                // Determine the youngest friend
                String youngest;
                if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
                        youngest = "Amar";
                } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
                        youngest = "Akbar";
                } else {
                        youngest = "Anthony";
                }

                // Determine the tallest friend
                String tallest;
                if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
                        tallest = "Amar";
                } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
                        tallest = "Akbar";
                } else {
                        tallest = "Anthony";
                }

                // Display the results
                System.out.printf("The youngest friend is: %s\n", youngest);
                System.out.printf("The tallest friend is: %s\n", tallest);

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
