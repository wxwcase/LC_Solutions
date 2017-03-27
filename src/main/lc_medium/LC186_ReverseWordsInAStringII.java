package main.lc_medium;

/**
 * Created by wxwcase on 3/26/17.
 */
public class LC186_ReverseWordsInAStringII {

    public void reverseWords(char[] s) {

        if (s == null || s.length < 2) return;

        reverseString(s, 0, s.length - 1);

        int start = 0, end = 0;

        while (end < s.length) {
            if (s[end] != ' ') {
                end++;
            } else {
                reverseString(s, start, end - 1);
                start = ++end;
            }
        }

        // reverse last item
        reverseString(s, start, end - 1);
    }

    private void reverseString(char[] str, int start, int end) {
        while (start < end) {
            char c = str[start];
            str[start++] = str[end];
            str[end--] = c;
        }
    }
}
