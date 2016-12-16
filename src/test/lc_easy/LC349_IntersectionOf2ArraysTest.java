package test.lc_easy;

import main.lc_easy.LC349_IntersectionOf2Arrays;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 12/15/16.
 */
class LC349_IntersectionOf2ArraysTest {

    LC349_IntersectionOf2Arrays sol;

    @BeforeEach
    void setUp() {
        sol = new LC349_IntersectionOf2Arrays();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void intersectionNoIntersection() {
        int[] a = {1, 2, 3}, b = {4, 5, 6};
        assertArrayEquals(new int[0], sol.intersection(a, b));
    }

    @Test
    void intersectionSingleElement() {
        int[] a = {1, 2, 2, 3}, b = {2, 2, 4, 5};
        assertArrayEquals(new int[]{2}, sol.intersection(a, b));
    }

}