public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 8, 9, 20, 34, 56};
        int res = BinarySearch(array, 34);
        System.out.println(res);
    }

    static int BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
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
        return -1;
    }
}

