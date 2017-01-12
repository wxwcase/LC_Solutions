package main.lc_easy;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC88_MergeSortedArray {

    /**
     * Assume nums1 has enough space for nums2.
     * Note: edge cases be careful.
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = m - 1, b = n - 1;

        for (int i = m + n - 1; i >= 0; --i) {
            if (a >= 0 && b >= 0) {
                nums1[i] = (nums1[a] >= nums2[b] ? nums1[a--] : nums2[b--]);
            } else if (b >= 0) {
                nums1[i] = nums2[b--];
            }
        }

    }
}
