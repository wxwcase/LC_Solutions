package main.lc_easy;

/**
 * Created by wwang on 1/12/2017.
 */
public class LC396_RotateFunction {

    public int maxRotateFunction(int[] A) {

        if (A == null || A.length == 0) return 0;

        // initial sum: csum
        int csum = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            csum += i * A[i];
            sum += A[i];
        }

        int max = csum;

        for (int i = 1; i < A.length; i++) {
            csum = csum + sum - A.length * A[A.length - i];
            max = csum > max ? csum : max;
            System.out.println(csum);
        }

        return max;
    }

}
