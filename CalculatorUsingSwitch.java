// Creating Class with name CalculatorUsingSwitch to perform basic arithmetic operations
import java.util.Scanner;

class CalculatorUsingSwitch {
        public static void main(String[] args) {
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input values for two numbers
                System.out.print("Enter the first number: ");
                double first = input.nextDouble();

                System.out.print("Enter the second number: ");
                double second = input.nextDouble();

                // Get input for the operator
                System.out.print("Enter an operator (+, -, *, /): ");
                String op = input.next();

                // Initialize result variable
                double result;

                // Perform operation based on the operator using switch case
                switch (op) {
                        case "+":
                                result = first + second;
                                System.out.printf("Result: %.2f + %.2f = %.2f\n", first, second, result);
                                break;
                        case "-":
                                result = first - second;
                                System.out.printf("Result: %.2f - %.2f = %.2f\n", first, second, result);
                                break;
                        case "*":
                                result = first * second;
                                System.out.printf("Result: %.2f * %.2f = %.2f\n", first, second, result);
                                break;
                        case "/":
                                // Check for division by zero
                                if (second == 0) {
                                        System.out.println("Error: Division by zero is not allowed.");
                                } else {
                                        result = first / second;
                                        System.out.printf("Result: %.2f / %.2f = %.2f\n", first, second, result);
                                }
                                break;
                        default:
                                System.out.println("Invalid operator! Please use +, -, *, or /.");
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
