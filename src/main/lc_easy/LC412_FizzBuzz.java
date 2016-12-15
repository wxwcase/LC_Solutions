package main.lc_easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwang on 12/13/2016.
 */
public class LC412_FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }

        return res;
    }
}
