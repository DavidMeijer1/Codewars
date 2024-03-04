package levelEight;

import java.util.Arrays;

public class SortAndStar {
    public static void main(String[] args) {
        System.out.println(sortAndStar(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

    static String sortAndStar(String[] array) {
        Object[] sortedArray = Arrays.stream(array).sorted().toArray();
        String firstValue = sortedArray[0].toString();

        char[] charArray = firstValue.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            sb.append(charArray[i] + "***");
        }

        sb.delete(sb.length() - 3, sb.length());
        return sb.toString();
    }

}
