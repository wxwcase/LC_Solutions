package test.lc_easy;

import main.lc_easy.LC217_ContainsDuplicate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 12/18/16.
 */
class LC217_ContainsDuplicateTest {

    LC217_ContainsDuplicate sol;

    @BeforeEach
    void setUp() {
        sol = new LC217_ContainsDuplicate();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void containsNoDuplicate() {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {};
        int[] a3 = {1};
        assertFalse(sol.containsDuplicate(a1));
        assertFalse(sol.containsDuplicate(a2));
        assertFalse(sol.containsDuplicate(a3));
    }

    @Test
    void containsDuplicate() {
        int[] a1 = {1, 1, 2, 3, 4, 5};
        int[] a2 = {1, 3, 2, 6, 0, 9, 1};
        int[] a3 = {1, 1};
        assertTrue(sol.containsDuplicate(a1));
        assertTrue(sol.containsDuplicate(a2));
        assertTrue(sol.containsDuplicate(a3));
    }

}