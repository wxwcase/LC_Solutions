package test.lc_easy;

import main.lc_easy.LC438_FindAllAnagramInAString;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by wxwcase on 1/8/17.
 */
class LC438_FindAllAnagramInAStringTest {

    LC438_FindAllAnagramInAString sol = new LC438_FindAllAnagramInAString();

    @Test
    void fndAnagram() {

        String a = "cbaebabacd", b = "abc";

        List<Integer> e = new LinkedList<>();
        e.add(0);
        e.add(6);

        List<Integer> r = sol.fndAnagram(a, b);

        assertTrue(e.containsAll(r) && r.containsAll(e));
    }

    @Test
    void fndAnagram2() {

        String a = "abab", b = "ab";

        List<Integer> e = new LinkedList<>();
        e.add(0);
        e.add(1);
        e.add(2);

        List<Integer> r = sol.fndAnagram(a, b);

        assertTrue(e.containsAll(r) && r.containsAll(e));
    }

    @Test
    void testAnagrams() {
        String a1 = "abc", r1 = "cba";
        String a2 = "abc", r2 = "bca";
        String a3 = "abc", r3 = "bac";
        assertTrue(sol.isAnagram(a1, r1));
        assertTrue(sol.isAnagram(a2, r2));
        assertTrue(sol.isAnagram(a3, r3));
    }
}