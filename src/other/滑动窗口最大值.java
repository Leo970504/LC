package other;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 滑动窗口最大值 {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o2, o1) -> o2 - o1);
        if(num == null || num.length < size || size <=0) {
            return null;
        }
        int index = 0;
        while(index < num.length) {
            if(index < size) {
                maxQueue.offer(num[index]);
                index++;
            }else {
                res.add(maxQueue.peek());
                maxQueue.remove(num[index - size]);
                maxQueue.add(num[index]);
                index++;
            }
        }
        res.add(maxQueue.peek());
        return res;
    }
}
