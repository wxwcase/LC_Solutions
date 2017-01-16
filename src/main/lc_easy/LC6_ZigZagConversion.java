package main.lc_easy;

/**
 * Created by wwang on 1/16/2017.
 */
public class LC6_ZigZagConversion {

    public String convert(String s, int numRows) {

        // edge cases
        if (s == null || s.length() == 0 || numRows <= 1 || numRows > s.length()) {
            return s;
        }

        StringBuilder[] list = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            list[i] = new StringBuilder();
        }

        int index = 0;
        int increase = 1;
        for (int i = 0; i < s.length(); i++) {
            list[index].append(s.charAt(i));
            if (index == numRows - 1) increase = -1;
            if (index == 0) increase = 1;
            index += increase;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list) {
            res.append(sb);
        }

        return res.toString();
    }

}
