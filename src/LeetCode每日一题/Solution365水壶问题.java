package LeetCode每日一题;

import java.util.HashMap;

public class Solution365水壶问题 {

    public boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) return true;
        if (x == z || y == z) return true;
        if (x == z || x + y == z) return true;
        if (x == y) return false;
        int big = x > y ? x : y;
        int small = x < y ? x : y;
        HashMap<Integer, Integer> map = new HashMap<>();
        int hel = big;
        while (!map.containsKey(hel)) {
            map.put(hel, 1);
            if (hel < small)
                hel += big;
            else
                hel -= small;
            if (hel == z) return true;
        }
        return false;
    }
}
