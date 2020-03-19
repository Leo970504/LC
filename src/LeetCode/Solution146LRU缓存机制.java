package LeetCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution146LRU缓存机制 extends LinkedHashMap<Integer, Integer> {
    int capacity;

    public Solution146LRU缓存机制(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
