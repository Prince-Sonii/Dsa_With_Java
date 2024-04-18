public class CountRotation {
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,0,1,2};
        System.out.println(findNoOfRotation(arr));
    }
    static int findNoOfRotation(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start<end) {
            int mid = start+(end-start)/2;
            if (mid<end && array[mid]>array[mid+1]) {
                return mid+1;
            }
            if(mid>start && array[mid]<array[mid-1]) {
                return mid;
                //this mean that the pivot is mid-1, so we are taking mid in order to find the count
                // and the count is nothing just pivot+1
            }
            if (array[0]>array[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }

        }
        return 0;


    }
}
