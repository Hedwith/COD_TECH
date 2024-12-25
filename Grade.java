import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        System.out.println("Enter grades (type -1 to finish):");

        while (true) {
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            }
            if (grade >= 0 && grade <= 100) {
                total += grade;
                count++;
            } else {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            }
        }

        if (count == 0) {
            System.out.println("No grades entered.");
        } else {
            double average = total / count;
            System.out.printf("Average grade: %.2f\n", average);

            String letterGrade = average >= 90 ? "A" :
                                 average >= 80 ? "B" :
                                 average >= 70 ? "C" :
                                 average >= 60 ? "D" : "F";

            System.out.println("Letter grade: " + letterGrade);
        }

        scanner.close();
    }
}
