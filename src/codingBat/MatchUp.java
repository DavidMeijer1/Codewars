package codingBat;

public class MatchUp {
    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }

    static int matchUp(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if ((array2[i] - array1[i] <= 2 && array1[i] - array2[i] <= 2) && array1[i] != array2[i]) {
                count++;
            }
        }
        return count;
    }
}
