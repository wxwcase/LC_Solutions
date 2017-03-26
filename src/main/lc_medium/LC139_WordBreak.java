package main.lc_medium;

import java.util.*;

/**
 * Created by wxwcase on 3/26/17.
 */
public class LC139_WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] canBuilt = new boolean[s.length() + 1];

        canBuilt[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (canBuilt[j] && wordDict.contains(s.substring(j, i))) {
                    canBuilt[i] = true;
                    break;
                }
            }
        }

        return canBuilt[canBuilt.length];
    }
}
