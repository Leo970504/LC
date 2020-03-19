package search;

public class 二分查找 {

    public static int binarySearch(int[] array, int key) {
        if(array == null || array.length == 0) {
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        int mid = low + high >>1;
        while(high >= low) {
            int value = array[mid];
            if(key == value) {
                return mid;
            }else if(key > value) {
                low = mid + 1;
                mid = low + high >> 1;
            }else if(key < value) {
                high = mid - 1;
                mid = low + high >> 1;
            }
        }
        return -1;
    }
}