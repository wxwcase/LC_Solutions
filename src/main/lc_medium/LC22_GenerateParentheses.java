package main.lc_medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WWang on 3/10/2017.
 */
public class LC22_GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        if (n < 1) return res;

        helper(n, res, "", n, n);

        return res;
    }

    private void helper(int n,
                        List<String> result,
                        String sub,
                        int leftUsed,
                        int rightUsed) {
        // end
        if (sub.length() == 2 * n) {
            result.add(sub);
            return;
        }

        // 0: use left (, 1: use right )
        for (char c : "()".toCharArray()) {
            if (c == '(' && leftUsed < n && leftUsed >= rightUsed)
                helper(n, result, sub + c, leftUsed + 1, rightUsed);
            if (c == ')' && rightUsed < n && leftUsed > rightUsed)
                helper(n, result, sub + c, leftUsed, rightUsed + 1);
        }
    }
}
