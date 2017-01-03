package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC434_NumberOfSegmentsInAString {

    public int countSegments(String s) {

        if (s == null)
            return 0;

        s = s.trim();

        if (s.length() == 0)
            return 0;

        String[] res = s.split("\\s+");

        return res.length;
    }
}

