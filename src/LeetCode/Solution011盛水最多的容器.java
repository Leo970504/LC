package LeetCode;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Solution011盛水最多的容器 {

    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }

    //双指针
    public static int maxArea(int[] height) {
        int p = 0;
        int q = height.length - 1;
        int max = 0;
        while(p < q) {
            max = Math.max(Math.min(height[p], height[q]) * (q - p), max);
            if(height[p] < height[q]) {
                p++;
            }else {
                q--;
            }
        }
        return max;
    }

/*
    public static int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                int x = j - i;
                int y = Math.min(height[i], height[j]);
                max = Math.max(x * y, max);
            }
        }
        return max;
    }
 */
}
