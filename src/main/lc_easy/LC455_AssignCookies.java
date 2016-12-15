package main.lc_easy;

import java.util.Arrays;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC455_AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        int count = 0, gptr = 0, sptr = 0;

        Arrays.sort(g);

        Arrays.sort(s);

        while (gptr < g.length && sptr < s.length) {
            if (g[gptr] <= s[sptr]) {
                ++count;
                ++gptr;
            }
            ++sptr;
        }

        return count;
    }
}
