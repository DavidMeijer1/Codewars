package levelEight;

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        System.out.println(totalAmountOfPoints(new String[]{"3:1", "2:2", "0:1"}));
    }

    static int totalAmountOfPoints(String[] array) {
        int points = 0;
        for (String str : array
        ) {
            if (str.charAt(0) > str.charAt(2)) {
                points += 3;
            }
            if (str.charAt(0) == str.charAt(2)) {
                points += 1;
            }
        }
        return points;
    }
}
