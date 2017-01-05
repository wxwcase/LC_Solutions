package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wwang on 1/5/2017.
 */
public class LC232_ImplementQueueUsingStacks {

    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
