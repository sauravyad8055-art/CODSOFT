import java.util.Scanner;

public class StudentGradeCalculatorSaurav {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; 
                continue;
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / subjects;

        
        String grade;

        if (average >= 90) {
            grade = "A+";
        } 
        else if (average >= 80) {
            grade = "A";
        } 
        else if (average >= 70) {
            grade = "B";
        } 
        else if (average >= 60) {
            grade = "C";
        } 
        else if (average >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        
        System.out.println("\n===== Result =====");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
