package main.lc_easy;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC389_FindTheDifference {

    public char findTheDifference(String s, String t) {

        char res = 0;

        for (char c : s.toCharArray()) {
            res ^= c;
        }

        for (char c : t.toCharArray()) {
            res ^= c;
        }

        return res;
    }
}
