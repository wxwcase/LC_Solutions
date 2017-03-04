package test.lc_easy;

import main.lc_easy.LC349_IntersectionOf2Arrays;
import main.lc_easy.LC492_ConstructTheRectangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/4/17.
 */
class LC492_ConstructTheRectangleTest {

    LC492_ConstructTheRectangle sol;

    @BeforeEach
    void setUp() {
        sol = new LC492_ConstructTheRectangle();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void constructRectangle() {
        int n = 4;
        assertArrayEquals(new int[]{2, 2}, sol.constructRectangle(n));
    }



}