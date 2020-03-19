package search;

//二分查找

public class 旋转数组中的最小值 {

    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        int low = 0;
        int mid = 0;
        int high = array.length - 1;
        while(low < high) {
            mid = (low + high) / 2;
            if(array[mid] > array[low]) {
                low = mid;
            }else if(array[mid] < array[high]) {
                high = mid;
            }else {
                low++;
            }
        }
        return array[low];
    }
}
