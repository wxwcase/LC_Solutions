package main.other;

/**
 * Created by wxwcase on 3/14/17.
 */
public class StringRotation {

    // Test if second string is rotation of first
    public boolean stringRotation(String s1, String s2) {

        if (s1 == null && s2 == null) return true;

        if (s1 == null || s2 == null) return false;

        return (s1.length() == s2.length()) && (s1 + s1).indexOf(s2) != -1;
    }
}
