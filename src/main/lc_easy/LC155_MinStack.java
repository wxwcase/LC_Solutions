package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wwang on 1/13/2017.
 */
public class LC155_MinStack {

    static class MinStack {

        LinkedList<Integer> stack;
        LinkedList<Integer> minStack;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
        }

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.push(x);
                minStack.push(x);
            } else {
                if (x < minStack.peek()) {
                    minStack.push(x);
                } else {
                    minStack.push(minStack.peek());
                }
                stack.push(x);
            }
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            if (!stack.isEmpty()) {
                return stack.peek();
            } else {
                return 0;
            }
        }

        public int getMin() {
            if (!minStack.isEmpty()) {
                return minStack.peek();
            } else {
                return 0;
            }
        }

    }
}
