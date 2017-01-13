package main.lc_easy;

/**
 * Created by wxwcase on 1/12/17.
 */
public class LC28_ImplementStrStr {

    public int strStr(String haystack, String needle) {

        // edge cases
        if (haystack == null || needle == null || needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        int start = 0;
        while (start <= haystack.length() - needle.length()) {
            if (haystack.charAt(start) == needle.charAt(0)) {
                int s = start;
                boolean failed = false;
                for (int i = 0; i < needle.length(); i++) {
                    if (haystack.charAt(s++) != needle.charAt(i)) {
                        failed = true;
                        break;
                    }
                }
                if (!failed) {
                    return start;
                }
            }
            start++;
        }

        return -1;
    }
}
