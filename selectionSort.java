import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 7, 3, 2, 1};
        sorting(array);
        System.out.println(Arrays.toString(array));

    }

    static void sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int length = array.length - (1 + i);
            // now find max element from start to length
            int max = maxElementIndex(array,0,length);
            // now swap max with end index
            swapping(array, max, length);
        }
    }

    // for finding index of maximum element
    static int maxElementIndex(int[] array, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
    // for swapping index of maximum element with end index
    static void swapping(int[] array, int maxIndex, int end) {
        int temp = array[maxIndex];
        array[maxIndex] = array[end];
        array[end] = temp;
    }
}
