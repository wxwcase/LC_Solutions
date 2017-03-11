package main.lc_medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WWang on 3/10/2017.
 */
public class LC423_ReconstructOriginalDigitsFromEnglish {

    // z -> 0    zero
    // w -> 2    two
    // u -> 4    four
    // x -> 6    six
    // g -> 8    eight

    // o -> 1    one
    // t -> 3    three
    // f -> 5    five
    // s -> 7    seven
    // i -> 9    nine
    public String originalDigits(String s) {

        if (s == null || s.length() == 0) return "";

        int[] arr = new int[128];

        for (char c : s.toCharArray()) arr[c]++;

        int[] result = new int[10];

        result[0] = arr['z'];
        result[2] = arr['w'];
        result[4] = arr['u'];
        result[6] = arr['x'];
        result[8] = arr['g'];

        result[1] = arr['o'] - result[0] - result[2] - result[4];
        result[3] = arr['h'] - result[8];
        result[5] = arr['f'] - result[4];
        result[7] = arr['s'] - result[6];
        result[9] = arr['i'] - result[6] - result[8] - result[5];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = result[i]; j > 0; j--) sb.append(i);
        }

        return sb.toString();
    }

}
