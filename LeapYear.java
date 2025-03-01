// Creating Class with name LeapYear to determine if a given year is a leap year
import java.util.Scanner;

class LeapYear {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for year
                System.out.print("Enter a year (>= 1582): ");
                int year = input.nextInt();

                // Check if the year is valid (Gregorian calendar starts from 1582)
                if (year < 1582) {
                        System.out.printf("The year %d is not in the Gregorian calendar system.", year);
                } else {
                        // Approach 1: Using multiple if-else statements
                        if (year % 4 == 0) {
                                if (year % 100 == 0) {
                                        if (year % 400 == 0) {
                                                System.out.printf("The year %d is a Leap Year.\n", year);
                                        } else {
                                                System.out.printf("The year %d is NOT a Leap Year.\n", year);
                                        }
                                } else {
                                        System.out.printf("The year %d is a Leap Year.\n", year);
                                }
                        } else {
                                System.out.printf("The year %d is NOT a Leap Year.\n", year);
                        }

                        // Approach 2: Using a single if statement with logical operators
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                                System.out.printf("[Logical Check] The year %d is a Leap Year.", year);
                        } else {
                                System.out.printf("[Logical Check] The year %d is NOT a Leap Year.", year);
                        }
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
