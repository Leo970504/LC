package LeetCode;

import java.util.HashSet;

public class Solution202快乐数 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)) {
            set.add(n);
            int temp = n;
            int sum = 0;
            while(temp != 0) {
                sum = (temp % 10) * (temp % 10) + sum;
                temp = temp /10;
            }
            if(sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }
}
