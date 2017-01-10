package main.lc_easy;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC223_RectangleArea {

    /**
     * Find area coverred by two rectangles (A, B), (C, D) and (E, F), (G, H)
     */
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

        // invalid rectangles
        if (A > C || E > G || B > D || F > H) return 0;

        int intersection = 0;

        // no intersection
        if (A >= G || E >= C || D <= F || B >= H) {
            intersection = 0;
        } else {
            int width = Math.min(C, G) - Math.max(A, E);
            int height = Math.min(D, H) - Math.max(B, F);
            intersection = width * height;
        }

        return (C - A) * (D - B) + (G - E) * (H - F) - intersection;

    }
}
