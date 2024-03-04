package levelSeven;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
    }

    static String oddOrEven(int[] array) {
        int sum = 0;
        for (int integer : array
        ) {
            sum += integer;
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
