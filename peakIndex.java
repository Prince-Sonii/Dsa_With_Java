public class peakIndex {
    public static void main(String[] args) {
        int []arr = {19,24,25,29,34,39,50,51,56,61,67,82,87,88,97,73,72,23};
        int ans= peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end= arr.length-1;
        while(start<end) {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end =mid;
            }
            else {
                start = mid+1;
            }

        }
        // we can return start as well as end because both are equal as the loop ends
        return start;

    }
}
