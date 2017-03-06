package main.lc_easy;

/**
 * Created by wxwcase on 3/5/17.
 */
public class LC504_Base7 {

    public String convertToBase7(int num) {

        if (num == 0)
            return "0";

        String prefix = num > 0 ? "" : "-";

        StringBuilder sb = new StringBuilder();

        int remainder = Math.abs(num);
        while (remainder != 0) {
            sb.append(remainder % 7);
            remainder /= 7;
        }
        sb.append(prefix);

        return sb.reverse().toString();
    }
}
