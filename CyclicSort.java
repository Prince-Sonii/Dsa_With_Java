import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int [] array = {9,6,4,2,3,5,7,8,1};
        sorting(array);
        System.out.println(Arrays.toString(array));
    }
    static void sorting(int[]array) {
        for(int i=0;i< array.length;) {
            if (array[i]-1!=i) {
                /*
                here we are swapping element on ith index with index number = element-1
                 */
                int temp = array[array[i]-1];
                array[array[i]-1] = array[i];
                array[i] = temp;
            } else {
                i++;
            }
        }
    }
}
