// Creating Class with name BMICalculator to compute BMI and determine weight status
import java.util.Scanner;

class BMICalculator {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input for weight in kg
                System.out.print("Enter your weight in kg: ");
                double weight = input.nextDouble();

                // Get input for height in cm
                System.out.print("Enter your height in cm: ");
                double heightInCm = input.nextDouble();

                // Convert height from cm to meters
                double heightInMeters = heightInCm / 100;

                // Compute BMI using formula: BMI = weight / (height * height)
                double bmi = weight / (heightInMeters * heightInMeters);

                // Determine weight status based on BMI
                String status;
                if (bmi < 18.5) {
                        status = "Underweight";
                } else if (bmi >= 18.5 && bmi < 24.9) {
                        status = "Normal";
                } else if (bmi >= 25 && bmi < 39.9) {
                        status = "Overweight";
                } else {
                        status = "Obese";
                }

                // Display the result
                System.out.printf("Your BMI is: %.2f\n", bmi);
                System.out.printf("Weight Status: %s\n", status);

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
