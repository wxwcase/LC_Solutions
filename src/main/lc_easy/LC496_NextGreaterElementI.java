package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wxwcase on 3/3/17.
 */
public class LC496_NextGreaterElementI {

    public int[] nextGreaterElement(int[] findNums, int[] num) {

        int[] res = new int[findNums.length];

        for (int i = 0; i < findNums.length; i++)
            res[i] = -1;


        for (int i = 0; i < findNums.length; i++) {

            int idx = search(num, findNums[i]);

            // num is subset of findNum so, no need to check -1
            for (int j = idx + 1; j < num.length; j++) {
                if (num[j] > findNums[i]) {
                    res[i] = num[j];
                    break;
                }
            }
        }

        return res;
    }

    public int search(int[] arr, int key) {

        if (arr == null || arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int[] arr, int key) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int lo = 0, hi = arr.length - 1;
        int mid;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}
