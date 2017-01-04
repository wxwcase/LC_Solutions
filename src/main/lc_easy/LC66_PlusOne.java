package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC66_PlusOne {

    /**
     * Non-negative integer represented as an array of digits.
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {

        if (digits == null || digits.length == 0)
            return new int[] {1};

        // note: extra slot
        LinkedList<Integer> list = new LinkedList<>();
        boolean carry = false;
        int i = digits.length - 1;

        carry = (digits[i] + 1) > 9;
        list.add((digits[i--] + 1) % 10);
        while (i >= 0) {
            if (carry) {
                list.addFirst((digits[i] + 1) % 10);
                carry = (digits[i] + 1) > 9;
            } else {
                list.addFirst(digits[i] % 10);
            }
            i--;
        }

        if (carry)
            list.addFirst(1);

        int[] res = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }

        return res;
    }
}
