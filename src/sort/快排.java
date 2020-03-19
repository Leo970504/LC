package sort;

import java.util.ArrayList;

public class 快排 {
    ArrayList<Integer> list = new ArrayList<>();
    public static void qSort(ArrayList<Integer> list, int low, int high) {
        if (low >= high) return;
        int i = low;
        int j = high;
        int key = list.get(i);
        while (i < j) {
            while (i < j && list.get(j) >= key) {
                j--;
            }
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
            while (i < j && list.get(i) <= key) {
                i++;
            }
            temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
        }
        qSort(list, low, i - 1);
        qSort(list, i + 1, high);
    }
    public Double GetMedian() {
        qSort(list, 0, list.size() - 1);
        int len = list.size() - 1;
        if(len % 2 == 1) {
            return Double.valueOf(list.get(len / 2) + list.get(len / 2 + 1) >> 1);
        }else {
            return Double.valueOf(list.get(len / 2));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(1);
        System.out.println(arr.toString());
        qSort(arr, 0, arr.size() - 1);
        System.out.println(arr.toString());
    }
}
