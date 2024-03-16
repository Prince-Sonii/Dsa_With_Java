import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        Rev(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Rev(int [] array) {
        int start=0;
        int end = array.length-1;
        while (array[start]<array[end]) {
            int temp=array[start];
            array[start] = array[end];
            array[end] =temp;
            start++;
            end--;
        }
    }
}
