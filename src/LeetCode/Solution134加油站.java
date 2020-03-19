package LeetCode;

public class Solution134加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0; i<gas.length; i++) {
            int j = i;
            int len = 0;
            int surplus = 0;
            while(len != gas.length) {
                surplus = surplus + gas[j];
                if(surplus >= cost[j]) {
                    surplus = surplus - cost[j];
                }else {
                    break;
                }
                len++;
                if(j == gas.length - 1)
                    j = 0;
                else
                    j++;
            }
            if(len == gas.length)
                return i;
        }
        return -1;
    }
    //另一种解法
    /*
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = 0;
        int total = 0;
        int cur = 0;
        for(int i = 0; i < gas.length; i++) {
            total = total + gas[i] - cost[i];
            cur = cur + gas[i] - cost[i];
            if(cur < 0) {
                res = i + 1;
                cur = 0;
            }
        }
        return total >= 0 ? res : -1;
    }
     */
}
