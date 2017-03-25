package main.lc_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by wxwcase on 3/24/17.
 */
public class LC380_InsertDeleteRandomO1 {

    // val: location
    Map<Integer, Integer> map;

    ArrayList<Integer> values;

    /** Initialize your data structure here. */
    public LC380_InsertDeleteRandomO1() {
        map = new HashMap<>();
        values = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, values.size());
            values.add(val);
            return true;
        } else {
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        // swap the value with the last item in the arraylist, remove the last
        if (map.containsKey(val)) {
            int pos = map.get(val);
            int lastVal = values.get(values.size() - 1);
            map.put(lastVal, pos);
            values.set(pos, lastVal);
            map.remove(val);
            values.remove(values.size() - 1);
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        return values.get(rand.nextInt(values.size()));
    }
}
