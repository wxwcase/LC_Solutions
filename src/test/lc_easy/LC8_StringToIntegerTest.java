package test.lc_easy;

import main.lc_easy.LC8_StringToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/17/2017.
 */
class LC8_StringToIntegerTest {

    /**
     * Requirements for atoi:
        1. The function first discards as many whitespace characters as necessary
            until the first non-whitespace character is found. Then, starting from
            this character, takes an optional initial plus or minus sign followed
            by as many numerical digits as possible, and interprets them as a
            numerical value.
        2. The string can contain additional characters after those that form the
            integral number, which are ignored and have no effect on the behavior
            of this function.
        3. If the first sequence of non-whitespace characters in str is not a valid
            integral number, or if no such sequence exists because either str is
            empty or it contains only whitespace characters, no conversion is performed.
        4. If no valid conversion could be performed, a zero value is returned.
            If the correct value is out of the range of representable values,
            INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
     */

    LC8_StringToInteger sol = new LC8_StringToInteger();

    @Test
    void myAtoiInvalid() {
        String s0 = " abc";
        int r0 = 0;
        assertEquals(r0, sol.myAtoi(s0));

        String s1 = "";
        int r1 = 0;
        assertEquals(r1, sol.myAtoi(s1));

        String s2 = "abc+";
        int r2 = 0;
        assertEquals(r2, sol.myAtoi(s2));

        String s3 = "+-2";
        int r3 = 0;
        assertEquals(r3, sol.myAtoi(s3));

        String s4 = " b123";
        int r4 = 0;
        assertEquals(r4, sol.myAtoi(s4));
    }

    @Test
    void myAtioPositive() {
        String s1 = " abc+123cde ";
        int r1 = 0;
        assertEquals(r1, sol.myAtoi(s1));

        String s2 = "123+ef";
        int r2 = 123;
        assertEquals(r2, sol.myAtoi(s2));

        String s3 = "0123";
        int r3 = 123;
        assertEquals(r3, sol.myAtoi(s3));

        String s4 = "123a3";
        int r4 = 123;
        assertEquals(r4, sol.myAtoi(s4));

        String s5 = "1";
        int r5 = 1;
        assertEquals(r5, sol.myAtoi(s5));
    }

    @Test
    void myAtioNegative() {
        String s1 = " -123d";
        int r1 = -123;
        assertEquals(r1, sol.myAtoi(s1));

        String s2 = "-1234abc";
        int r2 = -1234;
        assertEquals(r2, sol.myAtoi(s2));

        String s3 = "      -11919730356x";
        int r3 = -2147483648;
        assertEquals(r3, sol.myAtoi(s3));
    }

    @Test
    void myAtioOutofRange() {
        String s1 =  " 9876543219c";
        int r1 = Integer.MAX_VALUE;
        assertEquals(r1, sol.myAtoi(s1));

        String s2 = "-9876543219j";
        int r2 = Integer.MIN_VALUE;
        assertEquals(r2, sol.myAtoi(s2));

        String s3 = "9223372036854775809";
        int r3 = 2147483647;
        assertEquals(r3, sol.myAtoi(s3));
    }

}