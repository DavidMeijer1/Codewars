package levelEight;

import java.util.Arrays;

// https://www.codewars.com/kata/56b29582461215098d00000f
public class AscendingArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendArray(new int[]{1, 2, 3, 5, 6, 8, 9})));
        System.out.println(Arrays.toString(ascendArray(new int[]{1, 2, 3, 12})));
        System.out.println(Arrays.toString(ascendArray(new int[]{6, 9})));
        System.out.println(Arrays.toString(ascendArray(new int[]{-1, 4})));
        System.out.println(Arrays.toString(ascendArray(new int[]{1, 2, 3})));
    }

    static int[] ascendArray2(int[] array) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        int lowestNumber = sortedArray[0];
        int highestNumber = sortedArray[sortedArray.length - 1];

        StringBuilder sb = new StringBuilder();
        for (int i = lowestNumber; i <= highestNumber; i++) {
            sb.append(i + " ");
        }

        String[] stringArray = sb.toString().split(" ");
        int[] finalArray = new int[stringArray.length];
        for (int i = 0; i <= stringArray.length - 1; i++) {
            finalArray[i] = Integer.parseInt(stringArray[i]);
        }

        return finalArray;
    }

    static int[] ascendArray(int[] array) {
        int lowestNumber = array[0];
        int highestNumber = array[0];
        for (int integer : array
        ) {
            if (integer < lowestNumber) {
                lowestNumber = integer;
            }
            if (integer > highestNumber) {
                highestNumber = integer;
            }
        }
        int range = highestNumber - lowestNumber + 1;
        int[] sortedArray = new int[range];
        for (int i = 0; i < range; i++) {
            sortedArray[i] = i + lowestNumber;
        }
        return sortedArray;
    }
}
