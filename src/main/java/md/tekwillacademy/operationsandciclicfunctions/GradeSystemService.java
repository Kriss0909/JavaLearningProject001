package md.tekwillacademy.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int grade = 80;

        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade E");
        }
    }
}
