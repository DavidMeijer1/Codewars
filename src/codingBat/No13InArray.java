package codingBat;

public class No13InArray {
    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));
    }

    static boolean lucky13(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                return false;
            }
        }
        return true;
    }
}

