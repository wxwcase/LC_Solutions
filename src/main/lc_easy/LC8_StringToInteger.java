package main.lc_easy;

/**
 * Created by wwang on 1/17/2017.
 */
public class LC8_StringToInteger {

    /**
     * Possible edge cases:
     * 1. Starts with space or non-integer characters
     * 2. Starts with negative/positive sign
     * 3. Ends with non-integer characters
     * 4. If no valid conversion is performed return 0
     * 5. If valid conversion result is out of range of int, return Integer.MAX_VALUE or Integer.MIN_VALUE
     * @param str
     * @return
     */
    public int myAtoi(String str) {

        // empty string
        if (str == null || str.length() == 0) return 0;

        int index = 0, sign = 1, total = 0;

        // Remove spaces
        while (str.charAt(index) == ' ' && index < str.length()) index++;

        // handle sign
        if (str.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // convert number and avoid overflow
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;

            // overflow
            if (Integer.MAX_VALUE / 10 < total ||
                    Integer.MAX_VALUE / 10 == total &&
                    Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index++;
        }

        return total * sign;
    }
}
