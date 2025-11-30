import java.util.Scanner;

public class gradeCalculator {

    // Take input from user
    public static int[] takeMarksInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks for each subject (0 - 100): ");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        return marks;
    }

    // Calculate total
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Calculate average
    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    // Calculate grade based on average
    public static String calculateGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    // Display the result
    public static void displayResult(int total, double avg, String grade) {
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + avg);
        System.out.println("Grade       : " + grade);
    }

    // Main Function
    public static void main(String[] args) {

        int[] marks = takeMarksInput();                        // input function
        int total = calculateTotal(marks);                     // logic
        double avg = calculateAverage(total, marks.length);    // logic
        String grade = calculateGrade(avg);                    // logic

        displayResult(total, avg, grade);                      // output function
    }
}