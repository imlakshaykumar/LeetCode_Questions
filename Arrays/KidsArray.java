package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.Arrays;

/**
 * KidsArray
 */
public class KidsArray {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // this will convert array into a stream and get the max value as int
        int max = Arrays.stream(candies).max().getAsInt();
        int i = 0;
        int n = candies.length;
        while (i < n) {
            // add true if (candies[i] += extraCandies) >= max
            // else false
            result.add((candies[i] += extraCandies) >= max ? true : false);
            i++;
        }
        return result;
    }

    // We can also do this question like this:

    // public static void main(String[] args) {
    // int[] candies = { 12, 1, 12 };
    // int extraCandies = 10;
    // boolean[] ans = kidsWithCandies(candies, extraCandies);
    // System.out.println(Arrays.toString(ans));
    // }

    // static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
    // int n = candies.length;
    // boolean[] result = new boolean[n];
    // int i = 0;
    // while (i < n) {
    // candies[i] += extraCandies;
    // for (int j = 0; j < n; j++) {
    // if (i == j) {
    // continue;
    // }
    // if (candies[i] >= candies[j]) {
    // result[i] = true;
    // if (candies[i] < large(candies)) {
    // result[i] = false;
    // }
    // } else {
    // result[i] = false;
    // }
    // }
    // candies[i] -= extraCandies;
    // i++;
    // }
    // // System.out.println(Arrays.toString(result));
    // return result;
    // }

    // static int large(int[] candies) {
    // int max = Integer.MIN_VALUE;
    // int i = 0;
    // while (i < candies.length) {
    // if (candies[i] > max) {
    // max = candies[i];
    // }
    // i++;
    // }
    // return max;
    // }
}
