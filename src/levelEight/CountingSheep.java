package levelEight;

public class CountingSheep {
    public static void main(String[] args) {
        System.out.println(countSheep(new boolean[]{true, true, false}));
    }

    static int countSheep(boolean[] array) {
        int count = 0;
        for (Boolean booleanValue : array
        ) {
            if (booleanValue != null && booleanValue) {
                count++;
            }
        }
        return count;
    }
}
