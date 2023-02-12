package Arrays;

public class HighAltitude {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            alt += gain[i];
            if (alt > max) {
                max = alt;
            }
        }
        return max;
    }
}
