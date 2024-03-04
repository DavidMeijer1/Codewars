package codingBat;

public class ModThree {
    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 3, 5}));
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
        System.out.println(modThree(new int[]{2, 4, 2, 5}));
    }

    static boolean modThree(int[] array) {
        int row = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                row++;
                if (row == 3) {
                    return true;
                }
            } else {
                row = 0;
            }
        }
        int unevenRow = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                unevenRow++;
                if (unevenRow == 3) {
                    return true;
                }
            } else {
                unevenRow = 0;
            }
        }
        return false;
    }

}
