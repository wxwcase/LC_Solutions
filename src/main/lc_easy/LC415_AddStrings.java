package main.lc_easy;

/**
 * Created by wwang on 12/22/2016.
 */
public class LC415_AddStrings {

    public String addString(String num1, String num2) {

        if (num1 == null && num2 == null)
            return "";
        else if (num1 == null)
            return num2;
        else if (num2 == null)
            return num1;

        // base case
        int l1 = num1.length();
        int l2 = num2.length();

        if (l1 == 0)
            return num2;
        if (l2 == 0)
            return num1;

        // no one is empty/null
        StringBuilder sb = new StringBuilder();

        boolean carry = false;

        for (int i = num1.length() - 1, j = num2.length() - 1;
                i >= 0 || j >= 0 || carry == true;
                i--, j--) {
            int opd1 = (i < 0) ? 0 : (num1.charAt(i) - '0');
            int opd2 = (j < 0) ? 0 : (num2.charAt(j) - '0');
            int d = opd1 + opd2 + (carry ? 1 : 0);
            sb.append(d % 10);
            carry = d >= 10;
        }

        return sb.reverse().toString();
    }
}
