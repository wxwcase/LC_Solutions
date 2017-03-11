package main.lc_medium;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wxwcase on 3/10/17.
 */
public class LC341_FlattenNestedListIterator {

    // Error inputs:
    // 1. [[]]

    class NestedIterator implements Iterator<Integer> {

        private LinkedList<NestedInteger> _stack;
        private Integer next;

        public NestedIterator(List<NestedInteger> nestedList) {

            _stack = new LinkedList<>();

            for (int i = nestedList.size() - 1; i >= 0; i--) {
                _stack.push(nestedList.get(i));
            }

            next = null;
        }

        @Override
        public Integer next() {
            int n = next;
            next = null;
            return next;
        }

        @Override
        public boolean hasNext() {
            // find the next available Integer or return false
            if (next != null) return true;

            next = getFirst(_stack);

            return next == null ? false : true;
        }

        // check if stack is empty
        private Integer getFirst(LinkedList<NestedInteger> stack) {

            if (stack.size() == 0) return null;

            NestedInteger n = stack.pop();

            if (n.isInteger()) {
                return n.getInteger();
            } else {
                List<NestedInteger> l = n.getList();
                for (int i = l.size() - 1; i >= 0; i--) {
                    stack.push(l.get(i));
                }
                return getFirst(stack);
            }
        }
    }

    interface NestedInteger {

        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }
}
