public class FloorNumber {
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int res = fNum(arr,20);
        System.out.println(res);
    }
    static int fNum(int [] array, int target) {
        int start =0;
        int end = array.length-1;
        if (target<array[start]) {
            return -1;
        }
        while(start<=end) {
            int mid = start+(end-start)/2;
            if (target==array[mid]) {
                return mid;
            }
            if (target>array[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return end;
    }
}
