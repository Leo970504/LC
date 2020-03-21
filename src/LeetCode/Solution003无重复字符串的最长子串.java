package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Solution003无重复字符串的最长子串 {

    //滑动窗口
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int res = 0;
        int i = 0;
        int j = 0;
        while(i < len && j < len) {
            if(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                j++;
                if(j - i > res) {
                    res = j - i;
                }
            }
        }
        return res;
    }

    /* 暴力解法
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int res = 0;
        for(int i = 0; i < len; i++) {
            int p = i;
            int temp = 0;
            while(p < len && !set.contains(s.charAt(p))) {
                set.add(s.charAt(p));
                temp++;
                if(temp > res) {
                    res = temp;
                }
                p++;
            }
            set.clear();
            temp = 0;
        }
        return res;
    }
     */
}
