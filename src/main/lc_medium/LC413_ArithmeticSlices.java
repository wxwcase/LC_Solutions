package main.lc_medium;

/**
 * Created by wwang on 1/19/2017.
 */
public class LC413_ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {

        if (A == null || A.length < 3) return 0;

        return helper(A, 0, A.length - 1);
    }

    /**
     * f(n) = (n - 2)(n - 1) / 2
     * @param A
     * @param start
     * @param end
     * @return
     */
    private int helper(int[] A, int start, int end) {

        if (end - start == 2 && A[start + 1] - A[start] == A[end] - A[end - 1]) {
            return 1;
        } else if (end - start < 2) {
            return 0;
        }

        int count = 1;
        int delta = A[start + 1] - A[start];
        int s = start;
        while (s < end && A[s + 1] - A[s] == delta) {
            s++;
            count++;
        }

        // count - 2: when legit arithmetic series has len: count, then the difference between count and (count - 1)
        // f(n) - f(n - 1) = (n - 2)(n - 2) / 2 - (n - 3)(n - 2) / 2 = n - 2;
        count = count < 3 ? 0 : count - 2;
        return count + helper(A, start + 1, end);
    }
}
