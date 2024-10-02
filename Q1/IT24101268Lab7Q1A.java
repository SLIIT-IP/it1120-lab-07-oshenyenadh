import java.util.Scanner;

public class IT24101268Lab7Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for four subjects:");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        
        double average = (subject1 + subject2 + subject3 + subject4) / 4.0;
        
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
