// Creating Class with name LeapYearLogical to determine if a given year is a leap year using a single if condition
import java.util.Scanner;

class LeapYearLogical {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for year
                System.out.print("Enter a year (>= 1582): ");
                int year = input.nextInt();

                // Check if the year is valid (Gregorian calendar starts from 1582)
                if (year >= 1582) {
                        // Single if statement with logical && and || operators
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                                System.out.printf("The year %d is a Leap Year.", year);
                        } else {
                                System.out.printf("The year %d is NOT a Leap Year.", year);
                        }
                } else {
                        System.out.printf("The year %d is not in the Gregorian calendar system.", year);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
