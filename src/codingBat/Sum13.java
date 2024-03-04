package codingBat;

public class Sum13 {
    public static void main(String[] args) {
        System.out.println(sum13(new int[]{1, 2, 2, 1}));
        System.out.println(sum13(new int[]{1, 1}));
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));
    }

    static int sum13(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) {
                sum += 0;
                i++;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

}
