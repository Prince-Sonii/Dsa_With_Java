public class FindingPivot {
    public static void main(String[] args) {
        int [] nums = {3,4,5,6,0,1,2};
        System.out.println(pivotFind(nums));
    }
    static int pivotFind(int[]nums) {
        int start =0;
        int end = nums.length-1;
        while(start<end) {
            int mid = start +(end-start)/2;

            if(mid < end && nums[mid]>nums[mid+1]) {
                return mid+1;
            }
            if(mid > start && nums[mid]<nums[mid-1]) {
                return mid;
            }
            if(nums[mid]> nums[start]) {
                end = mid-1;
            } else {

                start = mid+1;
            }
        }
        return -1;
    }
}
