package test.lc_easy;

import org.junit.Test;
import static org.junit.Assert.*;
import main.lc_easy.*;

import java.util.List;

/**
 * Created by wwang on 12/13/2016.
 */
public class LC412_FizzBuzzTest {

    @Test
    public void testFizzBuzz1() {
        int n = 15;
        String[] returns = {
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
        };
        LC412_FizzBuzz sol = new LC412_FizzBuzz();
        List<String> res = sol.fizzBuzz(15);
        assertArrayEquals(returns, res.toArray());
    }
}
