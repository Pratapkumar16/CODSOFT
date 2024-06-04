import java.util.Scanner;

//Task 2 of the CodSoft Internship program batch 'May 05 2024' to 'June 05 2024'
public class ProgressCard {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = pk.nextLine();
        System.out.print("Enter the number of subjects: ");
        int sub = pk.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= sub; i++) {
            System.out.print("Enter marks(out of 100) for subject " + i + ": ");
            int marks = pk.nextInt();
            totalMarks += marks;
        }
        double avg = (double) totalMarks / sub;
        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "ImproveYourself";
        }
        System.out.println("Mr/Mis- " + name + "'s Progress Card : ");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage is: " + avg + "%");
        System.out.println("Grade: " + grade);

        pk.close();
    }
}
