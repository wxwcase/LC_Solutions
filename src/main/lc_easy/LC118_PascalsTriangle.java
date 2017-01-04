package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        LinkedList<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> row = new LinkedList<>();

        if (numRows == 0) {
            return res;
        }

        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 2).get(j) + res.get(i - 2).get(j - 1));
                }
            }
            res.add(new LinkedList(row));
            row.clear();
        }

        return res;
    }
}
