package main.lc_medium;

/**
 * Created by wwang on 3/9/2017.
 */
public class LC526_BeautifulArrangement {

    int count = 0;

    public int countArrangement(int N) {

        if (N == 0) return 0;

        int[] used = new int[N + 1];

        helper(N, 1, used);

        return count;
    }

    private void helper(int N, int pos, int[] used) {

        if (pos > N) {
            count++;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                used[i] = 1;
                helper(N, pos + 1, used);
                used[i] = 0;
            }
        }
    }

    public int countArrangement2(int N) {

        if (N == 0) return 0;

        int[] used = new int[N + 1];

        return helper2(N, 1, used);
    }

    private int helper2(int N, int pos, int[] used) {

        int count = 0;

        if (pos > N) {
            return ++count;
        }

        for (int i = 1; i < N; i++) {
            if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                used[i] = 1;
                count += helper2(N, pos + 1, used);
                used[i] = 0;
            }
        }

        return count;
    }
}
