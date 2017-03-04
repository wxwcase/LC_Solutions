package main.lc_easy;

/**
 * Created by wxwcase on 3/3/17.
 */
public class LC492_ConstructTheRectangle {

    public int[] constructRectangle(int area) {

        int[] res = new int[2];

        int start = (int)Math.sqrt(area);

        for (int i = start; i > 0; i--) {
            if (area % i == 0) {
                res[1] = i;
                res[0] = area / i;
                break;
            }
        }

        return res;
    }
}
