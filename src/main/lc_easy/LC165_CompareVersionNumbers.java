package main.lc_easy;

/**
 * Created by wwang on 1/17/2017.
 */
public class LC165_CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int count = v1.length > v2.length ? v1.length : v2.length;

        for (int i = 0; i < count; i++) {
            int d1 = Integer.valueOf(i < v1.length ? v1[i] : "0");
            int d2 = Integer.valueOf(i < v2.length ? v2[i] : "0");
            if (d1 > d2) {
                return 1;
            } else if (d1 < d2) {
                return -1;
            }
        }

        return 0;
    }
}
