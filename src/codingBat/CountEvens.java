package codingBat;

public class CountEvens {
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }

    static int countEvens(int[] array) {
        int count = 0;
        for (int integer : array
        ) {
            if (integer % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
