package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wwang on 1/11/2017.
 */
public class LC225_ImplementStackUsingQueues {

    LinkedList<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if (!queue.isEmpty())
            queue.removeLast();
    }

    // Get the top element.
    public int top() {
        if (!queue.isEmpty())
            return queue.getLast();
        return 0;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }

}
