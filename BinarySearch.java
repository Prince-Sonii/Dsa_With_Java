public class BinarySearch {
    public static void main(String[] args) {
        // increasing order array
        int[] array = {1, 2, 5, 7, 8, 9, 20, 34, 56};
        int res = BinarySearch(array,9);
        System.out.println("index of target in ascending order array:"+res);
        // decreasing order array
        int[] array2 = {20,19,6,5,4,3,2,1};
        int res2 = BinarySearch(array2, 2);
        System.out.println("index of target in descending order array:"+res2);
    }

    // code for Binary Search
    static int BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        // checking if the array is in ascending order
        if (array[0]<array[end]) {
            //code for ascending order array
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (target < array[middle]) {
                    end = middle - 1;
                } else if (target > array[middle]) {
                    start = middle + 1;
                } else {
                    return middle;
                }
            }
        }
        else{
            /*if this block of code will execute then it means the array is
                    in descending order
                    and here is the code for descending order array
                    */
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (target < array[middle]) {
                    start = middle+1;
                } else if (target > array[middle]) {
                    end = middle-1;
                } else {
                    return middle;
                }
            }

        }

        return -1;
    }
}

