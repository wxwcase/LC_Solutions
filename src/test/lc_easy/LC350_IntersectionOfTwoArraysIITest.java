package test.lc_easy;

import main.lc_easy.LC350_IntersectionOfTwoArraysII;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/19/2016.
 */
class LC350_IntersectionOfTwoArraysIITest {

    LC350_IntersectionOfTwoArraysII sol;

    @BeforeEach
    void setUp() {
        sol = new LC350_IntersectionOfTwoArraysII();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void intersect01() {
        int[] n1 = {1, 2, 2, 1}, n2 = {2, 2}, r1 = {2, 2};
        int[] res = sol.intersect(n1, n2);
        int[] res2 = sol.intersectPresorted(n1, n2);
        Arrays.sort(r1);
        Arrays.sort(res);
        assertArrayEquals(r1, res);
        assertArrayEquals(r1, res2);
    }

    @Test
    void intersect02() {
        int[] n1 = {1, 2}, n2 = {1, 1}, r1 = {1};
        int[] res = sol.intersect(n1, n2);
        int[] res2 = sol.intersectPresorted(n1, n2);
        Arrays.sort(res);
        Arrays.sort(r1);
        assertArrayEquals(r1, res);
        assertArrayEquals(r1, res2);
    }

    @Test
    void intersect03() {
        int[] n1 = {9, 1}, n2 = {7, 8, 3, 9, 0, 0, 9, 1, 5}, r1 = {1, 9};
        int[] res = sol.intersect(n1, n2);
        int[] res2 = sol.intersectPresorted(n1, n2);
        Arrays.sort(r1);
        Arrays.sort(res);
        Arrays.sort(res2);
        assertArrayEquals(r1, res);
        assertArrayEquals(r1, res2);
    }

    @Test
    void intersect04() {
        int[] n1 = {7, 2, 2, 4, 7, 0, 3, 4, 5}, n2 = {3, 9, 8, 6, 1, 9}, r1 = {3};
        int[] res = sol.intersect(n1, n2);
        int[] res2 = sol.intersectPresorted(n1, n2);
        Arrays.sort(res);
        Arrays.sort(res2);
        Arrays.sort(r1);
        assertArrayEquals(r1, res);
        assertArrayEquals(r1, res2);
    }
}