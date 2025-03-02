// Creating Class with name GradeCalculator to compute percentage and grade
import java.util.Scanner;

class GradeCalculator {
        public static void main(String[] args){
                // Create a Scanner Object to take user input
                Scanner input = new Scanner(System.in);

                // Get input marks for three subjects
                System.out.print("Enter marks for Physics: ");
                double physics = input.nextDouble();
                
                System.out.print("Enter marks for Chemistry: ");
                double chemistry = input.nextDouble();
                
                System.out.print("Enter marks for Maths: ");
                double maths = input.nextDouble();

                // Check if marks are valid (between 0 and 100)
                if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
                        System.out.println("Invalid marks entered! Marks should be between 0 and 100.");
                } else {
                        // Calculate total marks and percentage
                        double totalMarks = physics + chemistry + maths;
                        double percentage = (totalMarks / 300) * 100;

                        // Determine the grade and remarks
                        char grade;
                        String remarks;

                        if (percentage >= 80) {
                                grade = 'A';
                                remarks = "Level 4, above agency-normalized standards";
                        } else if (percentage >= 70) {
                                grade = 'B';
                                remarks = "Level 3, at agency-normalized standards";
                        } else if (percentage >= 60) {
                                grade = 'C';
                                remarks = "Level 2, below, but approaching agency-normalized standards";
                        } else if (percentage >= 50) {
                                grade = 'D';
                                remarks = "Level 1, well below agency-normalized standards";
                        } else if (percentage >= 40) {
                                grade = 'E';
                                remarks = "Level 1-, too below agency-normalized standards";
                        } else {
                                grade = 'R';
                                remarks = "Remedial Standards";
                        }

                        // Display the results
                        System.out.printf("Total Marks is %.2f out of 300 and Percentage is %.2f%%\nGrade of the student is: %c and remarks for student is %s", totalMarks, percentage, grade, remarks);
                }

                // Close the Scanner object to avoid resource leakage
                input.close();
        }
}
