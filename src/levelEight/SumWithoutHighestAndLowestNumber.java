package levelEight;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        System.out.println(sumWithoutHighestAndLowestNumber(new int[]{6, 2, 1, 8, 10}));
        System.out.println(sumWithoutHighestAndLowestNumber(new int[]{1, 1, 11, 2, 3}));
    }

    static int sumWithoutHighestAndLowestNumber(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) {
            return 0;
        }
        int lowestNumber = array[0], highestNumber = array[0], sum = 0;
        for (int integer : array
        ) {
            sum += integer;
            if (integer < lowestNumber) {
                lowestNumber = integer;
            }
            if (integer > highestNumber) {
                highestNumber = integer;
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < lowestNumber) {
//                lowestNumber = array[i];
//            }
//            if (array[i] > highestNumber) {
//                highestNumber = array[i];
//            }
//        }
        return sum - highestNumber - lowestNumber;
    }
}
