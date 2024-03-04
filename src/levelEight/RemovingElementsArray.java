package levelEight;

import java.util.Arrays;
import java.util.Objects;

public class RemovingElementsArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removingElements(new String[]{"Keep", "Remove", "Keep", "Remove", "Keep"})));
        System.out.println(Arrays.toString(removingElements(new String[]{"Hello", "Goodbye", "Hello Again"})));
    }

    static Object[] removingElements(Object[] array) {
        Object[] resultArray = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                resultArray[i] = array[i];
            }
        }
        return Arrays.stream(resultArray).filter(Objects::nonNull).toArray(Object[]::new);
    }
}

