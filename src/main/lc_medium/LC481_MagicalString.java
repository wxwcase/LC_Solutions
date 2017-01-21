package main.lc_medium;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC481_MagicalString {

    public int magicalString(int n) {

        int res = 0;

        if (n < 1) return res;

        StringBuilder s = new StringBuilder("12211");

        if (n > s.length()) {
            int cnt = 5;
            int ptr = 3; // "1221"
            char nxt = '2';
            int countNext = 0;
            while (cnt < n) {
                countNext = s.charAt(ptr) - '0';
                for (int i = 0; i < countNext; i++)
                    s.append(nxt);
                // flip
                cnt++;
                ptr++;
                nxt = nxt == '2' ? '1' : '2';
            }
        }

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') res++;
        }

        return res;
    }
}
