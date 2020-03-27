package LeetCode每日一题;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution914卡牌的分组 {

    public static boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        ArrayList<Integer> counts = new ArrayList<>();
        int i = 1;
        counts.add(1);
        while(i < deck.length) {
            int temp = deck[i - 1];
            if(deck[i] == temp) {
                counts.set(counts.size() - 1, counts.get(counts.size() - 1) + 1);
            } else {
                counts.add(1);
            }
            i++;
        }
        int x = counts.get(0);
        for(int num : counts) {
            x = getGcd(x, num);
            if(x < 2) {
                return false;
            }
        }
        return true;
    }

    public static int getGcd(int x, int y) {
        return x % y == 0 ? y : getGcd(y, x % y);
    }
}
