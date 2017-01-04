package main.lc_easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC119_PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> res = new LinkedList<>();

        res.add(1);

        if (rowIndex < 1)
            return res;

        for (int i = 1; i <= rowIndex; i++) {
            int tmp = 1;
            int size = res.size();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    if (j >= size) {
                        res.add(1);
                    } else {
                        res.set(j, 1);
                    }
                } else {
                    int num = res.get(j) + tmp;
                    tmp = res.get(j);
                    if (j >= size) {
                        res.add(num);
                    } else {
                        res.set(j, num);
                    }
                }
            }
        }

        return res;
    }

    public List<Integer> getRowOptimized(int rowIndex) {

        List<Integer> res = new LinkedList<>();

        if (rowIndex < 0)
            return res;

        for (int i = 0; i < rowIndex + 1; i++) {
            res.add(1);
            int s = res.size();
            for (int j = s - 2; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }

        return res;
    }
}

