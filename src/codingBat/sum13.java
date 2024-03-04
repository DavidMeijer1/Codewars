package codingBat;

public class sum13 {
    public static void main(String[] args) {
        System.out.println(sum13(new int[]{1, 2, 2, 1}));
        System.out.println(sum13(new int[]{1, 1}));
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));
    }

    static int sum13(int[] array) {
        int sum = 0;
        int[] resultArray = new int[array.length + 1];
        for (int i = 0; i < resultArray.length; i++) {
            if (array[i] == 13) {
                resultArray[i] = 0;
                resultArray[i + 1] = 0;
            } else {
                resultArray[i] = array[i];
            }
        }
        for (int integer : resultArray
        ) {
            sum += integer;
        }
        return sum;
    }

}
