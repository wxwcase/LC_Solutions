package main.lc_easy;

/**
 * Created by wxwcase on 1/5/17.
 */
public class LC38_CountAndSay {

    public String countAndSay(int n) {

        if (n == 1) return "1";

        if (n == 2) return "11";

        String rep = countAndSay(n - 1);

        int count = 1;
        int ptr = 0;
        char lastc = rep.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < rep.length(); i++) {
            if (rep.charAt(i) == lastc) {
                ++count;
            } else {
                sb.append(count);
                sb.append(lastc);
                count = 1;
                lastc = rep.charAt(i);
            }
        }

        sb.append(count);
        sb.append(lastc);

        return sb.toString();
    }
}
