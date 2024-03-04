package codingBat;

public class No14 {
    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3, 4}));
    }

    static boolean no14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
