package main.lc_medium;

import java.util.LinkedList;

/**
 * Created by wxwcase on 3/11/17.
 */
public class LC503_NextGreaterElementII {

    // 1. loop twice
    // 2. while currentItem > top of stack referenced item, then set popped out element's result to currentItem.val
    // 3. Determine whether to push current indexed item: if the item hasn't been set in result, then push.
    public int[] nextGreaterElements(int[] nums) {

        if (nums == null || nums.length == 0) return new int[0];

        int len = nums.length;

        int[] res = new int[len];

        for (int i = 0; i < len; i++) res[i] = -1;

        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < 2 * len; i++) {
            int index = i % len;
            // push index to stack
            if (stack.isEmpty()) {
                stack.push(index);
            } else {
                while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                    int idx = stack.pop();
                    res[idx] = nums[index];
                }
                if (res[index] == -1) stack.push(index);
            }
        }

        return res;
    }
}
