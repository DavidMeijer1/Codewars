package levelSeven;

//https://www.codewars.com/kata/5813d19765d81c592200001a

public class DontGiveMeFive {
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 9));
        System.out.println(dontGiveMeFive(4, 17));
    }

    static int dontGiveMeFive(int firstNumber, int lastNumber) {
        int range = lastNumber - firstNumber + 1;
        int[] array = new int[range];
        for (int i = 0; i < range; i++) {
            array[i] = i + firstNumber;
        }
        int count = 0;
        for (int integer : array
        ) {
            if (!Integer.toString(integer).matches(".*5.*")) {
                count++;
            }
        }
        return count;
    }

}
