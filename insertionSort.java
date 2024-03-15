import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int []array = {1,2,4,5,3};
        sorting(array);
        System.out.println(Arrays.toString(array));
    }
    static void sorting(int[] array) {
        for (int i=0;i<=array.length-2;i++) {
            for (int j=i+1;j>0;j--) {
                if (array[j]<array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
