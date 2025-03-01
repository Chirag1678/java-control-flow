// Creating Class with name EmployeeBonus to compute bonus based on years of service
import java.util.Scanner;

class EmployeeBonus {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input value for salary
                System.out.print("Enter the employee's salary: ");
                double salary = input.nextDouble();

                // Get input value for years of service
                System.out.print("Enter the employee's years of service: ");
                int yearsOfService = input.nextInt();

                // Initialize bonus to 0
                double bonus = 0.0;

                // Check if the employee is eligible for a bonus (more than 5 years of service)
                if (yearsOfService > 5) {
                        bonus = 0.05 * salary; // 5% of salary as bonus
                        System.out.printf("The employee's bonus amount is: INR %.2f\n", bonus);
                } else {
                        System.out.println("The employee is not eligible for a bonus.");
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
