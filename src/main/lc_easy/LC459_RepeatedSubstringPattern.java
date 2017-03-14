package main.lc_easy;

/**
 * Created by wwang on 12/23/2016.
 */
public class LC459_RepeatedSubstringPattern {

    /**
     * Assume string is lower-case letters and not empty.
     * Sol: substring length is a divisor of str.length().
     * @param str input string
     * @return
     */
    public boolean repeatedSubstringPattern(String str) {

        int len = str.length();

        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0) {
                // check substring of length i
                int mul = len / i;
                String sub = str.substring(0, i);
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < mul; j++) {
                    builder.append(sub);
                }
                if (builder.toString().equals(str)) {
                    return true;
                }
            }
        }


        return false;
    }

    // https://discuss.leetcode.com/topic/68206/easy-python-solution-with-explaination/6
    public boolean repeatedSubstringPattern2(String s) {
        String t = (s + s).substring(1, 2 * s.length() - 1);
        return t.contains(s);
    }
}
