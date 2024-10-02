import java.util.Scanner;

public class IT24101268Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Enter marks for 4 subjects for student " + student + " (separated by space):");
            String[] input = scanner.nextLine().split(" ");
            int[] marks = new int[4];
            int total = 0;

            for (int i = 0; i < 4; i++) {
                marks[i] = Integer.parseInt(input[i]);
                total += marks[i];
            }

            double average = total / 4.0;
            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Student " + student + " - Average marks: " + average + ", Grade: " + grade);
        }
    }
}
