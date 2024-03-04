package levelEight;

public class GradeBook {
    public static void main(String[] args) {
        System.out.println(getGrade(44, 55, 52));
        System.out.println(getGrade(48, 55, 52));
        System.out.println(getGrade(58, 59, 60));
    }

    static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        System.out.println(average);
        if (average > 90 && average <= 100) {
            return 'A';
        } else if (average >= 80 && average < 90) {
            return 'B';
        } else if (average >= 70 && average < 80) {
            return 'C';
        } else if (average >= 60 && average < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
