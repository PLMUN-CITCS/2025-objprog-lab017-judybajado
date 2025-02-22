import java.util.Scanner;

public class StudentGrade {


    public static char calculateGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static double getScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Error: Please enter a score between 0 and 100.");
            return -1; // Invalid score
        }
        return score;
    }


    public static void displayResult(char grade) {
        System.out.println("Your Grade is: " + grade);
    }


    public static void main(String[] args) {
        double score = getScore();
        
        if (score != -1) {
            char grade = calculateGrade(score);
            displayResult(grade);
        } else {
            System.out.println("No valid score provided. Program will exit.");
        }
    }
}
