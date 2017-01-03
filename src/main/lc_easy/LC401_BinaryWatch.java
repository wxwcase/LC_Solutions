package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 12/21/2016.
 */
public class LC401_BinaryWatch {

    public List<String> readBinaryWatch(int num) {

        List<String> res = new LinkedList<>();

        if (num >= 10) {
            res.add("11:59");
            return res;
        } else if (num == 0) {
            res.add("0:00");
            return res;
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int h = 0, m = 0;
                int c = i;
                for (int k = 0; k < 4; k++) {
                    h = (c & 1) == 1 ? (h + 1) : h;
                    c >>= 1;
                }
                c = j;
                for (int k = 0; k < 6; k++) {
                    m = (c & 1) == 1 ? (m + 1) : m;
                    c >>= 1;
                }
                if (h + m == num) {
                    String item = i + ":" + (j > 9 ? j : "0" + j);
                    res.add(item);
                }
            }
        }

        return res;
    }
}
