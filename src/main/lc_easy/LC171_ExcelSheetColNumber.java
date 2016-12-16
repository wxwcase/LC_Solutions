package main.lc_easy;

/**
 * Created by wwang on 12/16/2016.
 */
public class LC171_ExcelSheetColNumber {

    public int titleToNumber(String s) {

        int result = 0;

        int len = s.length();

        // empty string
        if (len == 0)
            return result;

        // single character string
        if (len == 1) {
            return s.charAt(0) - 'A' + 1;
        }

        // more than one char strings
         for (int i = 0; i < len; i++) {
            result += (s.charAt(i) - 'A' + 1) * Math.pow(26, len - 1 - i);
         }

        return result;
    }
}
