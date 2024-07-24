import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Enter total subjects:");
        int totalsubjects = scanner.nextInt();
        int[] marks = new int[totalsubjects];
        System.out.println("Enter the marks gained in each subject (out of 100):");
        for (int i = 0; i < totalsubjects; i++) {
            marks[i] = scanner.nextInt();
        }

        
        int totalmarks = 0;
        for (int mark : marks) {
            totalmarks += mark;
        }

    
        float averagepercentage = (float) totalmarks / totalsubjects;

    
        String grade;
        if (averagepercentage >= 85) {
            grade = "A+";
        } else if (averagepercentage >= 75 && averagepercentage <85) {
            grade = "A";
        } else if (averagepercentage >= 60 && averagepercentage <75) {
            grade = "B";
        } else if (averagepercentage >= 50 && averagepercentage <60) {
            grade = "C";
        } else if (averagepercentage >= 33 && averagepercentage <50) {
            grade = "D";
        } else {
            grade = "Fail!";
        }
        scanner.close();
        
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + averagepercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
