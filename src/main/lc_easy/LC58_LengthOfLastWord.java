package main.lc_easy;

/**
 * Created by wwang on 1/11/2017.
 */
public class LC58_LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0)
            return 0;

        String[] r = s.split("\\s+");
        if (r.length > 0)
            return r[r.length - 1].length();

        return 0;
    }
}
