package levelSeven;

// https://www.codewars.com/kata/566fc12495810954b1000030

public class CountTheDigit {
    public static void main(String[] args) {
        System.out.println(countTheDigit(25, 1));
    }

    static int countTheDigit(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int squareNumber = i * i;
            String[] stringArray = Integer.toString(squareNumber).split("");
            for (String str : stringArray
            ) {
                if (str.contains(Integer.toString(d))) {
                    count++;
                }
            }
        }
        return count;
    }
}

