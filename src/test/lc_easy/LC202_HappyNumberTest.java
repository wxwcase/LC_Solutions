package test.lc_easy;

import main.lc_easy.LC202_HappyNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/28/2016.
 */
class LC202_HappyNumberTest {

    LC202_HappyNumber sol = new LC202_HappyNumber();

    @Test
    void isHappy() {
        int a = 19;
        assertTrue(sol.isHappy(a));
    }

}