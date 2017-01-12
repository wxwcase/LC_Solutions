package main.lc_easy;

/**
 * Created by wwang on 1/11/2017.
 */
public class LC67_AddBinary {

    public String addBinary(String a, String b) {

        // invalid cases
        if (a == null || b == null) return "";

        // edge cases
        if (a.length() == 0)
            return b;
        else if (b.length() == 0)
            return a;

        StringBuilder res = new StringBuilder();

        int biglen = a.length() < b.length() ? b.length() : a.length();

        boolean carry = false;

        for (int i = 0; i < biglen; i++) {
            int ad = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0;
            int bd = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;
            res.append(ad ^ bd ^ (carry ? 1 : 0));
            carry = ad + bd + (carry ? 1 : 0) > 1;
        }

        if (carry) res.append(1);

        return res.reverse().toString();
    }


    public String addBinary1(String a, String b) {

        // invalid cases
        if (a == null || b == null) return "";

        // edge cases
        if (a.length() == 0)
            return b;
        else if (b.length() == 0)
            return a;

        // a set to the small length string
        String tmp = a;
        if (a.length() > b.length()) {
            a = b;
            b = tmp;
        }

        boolean carry = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); ++i) {
            int ad = a.charAt(a.length() - i - 1) - '0';
            int bd = b.charAt(b.length() - i - 1) - '0';
            int d = ad + bd;
            if (carry) {
                d++;
            }
            carry = d > 1 ? true : false;
            sb.append(d % 2);
        }

        for (int i = 0; i < b.length() - a.length(); ++i) {
            int bd = b.charAt(b.length() - a.length() - i - 1) - '0';
            if (carry) {
                bd++;
            }
            carry = bd > 1 ? true : false;
            sb.append(bd % 2);
        }

        if (carry) sb.append(1);

        return sb.reverse().toString();
    }
}
