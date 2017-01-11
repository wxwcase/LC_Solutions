package main.lc_easy;

/**
 * Created by wwang on 1/11/2017.
 */
public class LC14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        if (strs.length == 1) return strs[0];

        int shortestStrLen = Integer.MAX_VALUE;

        // find shortest length of an item in the array
        StringBuilder sb = null;
        for (String s : strs)
            if (s.length() < shortestStrLen) {
                shortestStrLen = s.length();
                sb = new StringBuilder(s);
            }

        boolean violate = false;
        for (int i = shortestStrLen; i > 0; i--) {
            violate = false;
            for (String s : strs) {
                if (!s.substring(0, i).equals(sb.toString())) {
                    sb = new StringBuilder(sb.substring(0, i - 1));
                    violate = true;
                    break;
                }
            }
            if (!violate)
                break;
        }

        return sb.toString();
    }
}
