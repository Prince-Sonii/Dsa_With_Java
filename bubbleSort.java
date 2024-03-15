import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []array = {5,4,3,2,1};
        sorting(array);
        System.out.println(Arrays.toString(array));
    }
    static void sorting(int[]array) {
        int length = array.length;
        while(length>0) {
            boolean ifSwapped = false;
            for (int i=1;i<length;i++) {
                if (array[i]<array[i-1]) {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    ifSwapped = true;
                }
            }
            /* if none of the element will be swapped in first iteration then
            it is already in ascending order and no need to apply sorting
             */
            if (ifSwapped==false) {
                break;
            }
            /*
            decreasing length of array after for loop because the last element will be largest,
            so no need to check for that
             */
            length--;
        }
    }
}
