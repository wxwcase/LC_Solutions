package main.lc_easy;

/**
 * Created by wwang on 12/22/2016.
 */
public class LC415_AddStrings {

    public String addString(String num1, String num2) {

        // base case
        if ((num1 == null) || (num2 == null))
            return "";

        int l1 = num1.length();
        int l2 = num2.length();

        if (l1 == 0)
            return num2;
        if (l2 == 0)
            return num1;

        // no one is empty/null
        boolean carry = false;
        StringBuilder sb = new StringBuilder();
        int loop = l1 > l2 ? l2 : l1;
        for (int i = loop - 1; i >= 0; i--) {
            int opd1 = Integer.valueOf("" + num1.charAt(loop));
            int opd2 = Integer.valueOf("" + num2.charAt(loop));
            int res = opd1 + opd2 + (carry ? 1 : 0);
            if (res > 9) {
                carry = true;
                res %= 10;
            } else {
                carry = false;
            }
            sb.append(res);
        }

        if (l1 == l2) {
            if (carry) {
                sb.append(1);
            }
        } else if (l1 > l2){
            for (int i = l1 - l2; i >= 0; i++) {
                sb.append(num1.charAt(i));
            }
        } else {
            for (int i = l2 - l1; i >= 0; i++) {
                sb.append((num2.charAt(i)));
            }
        }

        return sb.reverse().toString();
    }
}
