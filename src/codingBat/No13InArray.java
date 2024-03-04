package codingBat;

public class No13InArray {
    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));
    }

    static boolean lucky13(int[] numbers) {
        for (int integer : numbers) {
            return integer != 1 && integer != 3;
        }
        return false;
    }
}
