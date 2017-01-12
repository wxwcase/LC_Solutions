package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 1/9/2017.
 */
public class LC299_BullsAndCows {

    /**
     * Assume secret and guess only contains digits and has equal length
     * @param secret
     * @param guess
     * @return
     */
    public String getHint(String secret, String guess) {

        StringBuilder sb = new StringBuilder();

        int bulls = 0, cows = 0;

        int[] hash = new int[256];
        for (char c : secret.toCharArray()) {
            hash[c]++;
        }

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                --hash[secret.charAt(i)];
                ++bulls;
            }
        }

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                if (hash[guess.charAt(i)] > 0){
                    ++cows;
                    --hash[guess.charAt(i)];
                }
            }
        }

        sb.append(bulls);
        sb.append('A');
        sb.append(cows);
        sb.append('B');

        return sb.toString();
    }
}
