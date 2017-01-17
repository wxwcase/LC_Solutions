package main.lc_easy;

/**
 * Created by wwang on 1/16/2017.
 */
public class LC168_ExcelSheetColumnTitle {

    // Non-recursive solution
    public String convertToTitle(int n) {

        if (n < 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        while(n-- > 26) {
            sb.append((char)(n % 26 + 'A'));
            n /= 26;
        }

        sb.append((char)(n % 26 + 'A'));

        return sb.reverse().toString();
    }

    // Recursive solution
    public String convertToTitleRecursive(int n) {
        return n == 0 ? "" : convertToTitleRecursive(--n / 26) + (char)('A' + n % 26);
    }
}
