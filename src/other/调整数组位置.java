package other;

public class 调整数组位置 {

    public void reOrderArray(int[] array) {
        int i = 0;
        int len = array.length;
        int j = 0;
        while (i < len) {
            if (array[i] % 2 == 0) {
                j = i + 1;
                while (j < len) {
                    if (array[j] % 2 == 1) {
                        int temp = array[j];
                        while (j > i) {
                            array[j] = array[j - 1];
                            j--;
                        }
                        array[i] = temp;
                        break;

                    }
                    j++;
                }
            }
            i++;
        }
    }
}
