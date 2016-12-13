package main.lc_easy;

/**
 * Created by wwang on 12/13/2016.
 */
public class LC344_ReverseString {
    public String reverseString(String s) {
        if (s.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
