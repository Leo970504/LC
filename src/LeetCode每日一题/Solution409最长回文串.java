package LeetCode每日一题;

import java.util.HashMap;
import java.util.Map;

public class Solution409最长回文串 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int res = 0;
        if(len % 2 == 0) {
            int count = 0;
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry != null)
                    count += entry.getValue() % 2;
            }
            return len - count;
        } else {
            int count = 0;
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry != null)
                    count += entry.getValue() % 2;
            }
            return len - count + 1;
        }
    }
}
