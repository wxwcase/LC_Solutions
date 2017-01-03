package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 12/23/2016.
 */
public class LC405_ConvertANumber2Hex {

    public String toHex(int num) {

        if (num == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        int mask = 15;
        Map<Integer, Character> map = new HashMap<>();
        map.put(10, 'a');
        map.put(11, 'b');
        map.put(12, 'c');
        map.put(13, 'd');
        map.put(14, 'e');
        map.put(15, 'f');

        while (num != 0) {
            int res = num & mask;
            char c = res > 9 ? map.get(res) : (char)(res + '0');
            sb.append(c);
            num >>>= 4;
        }

        return sb.reverse().toString();
    }
}
