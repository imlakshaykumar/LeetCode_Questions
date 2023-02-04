package Arrays;

// import java.util.Arrays;

public class SmallNumber {
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i && nums[j] < nums[i]) {
                    result[i] += 1;
                }
            }
        }

        // int i = 0;
        // while (i < n) {
        // int j = 0;
        // while (j < n) {
        // if (j != i && nums[j] < nums[i]) {
        // result[i] += 1;
        // }
        // j++;
        // }
        // i++;
        // }
        return result;
    }

    // public static void main(String[] args) {
    // int[] arr = { 8, 1, 2, 2, 3 };
    // int[] ans = smallerNumbersThanCurrent(arr);
    // System.out.println(Arrays.toString(ans));
    // }
}
