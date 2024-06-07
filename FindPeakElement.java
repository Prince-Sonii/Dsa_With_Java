import java.util.Arrays;

class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
        // another test case for checking purpose
        System.out.println(findPeakElement(new int[]{11,2,3,4,6,7,4,9,10,11,5}));
    }
    static int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e) {
            int mid = s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]) {
                if(mid>0 && nums[mid]>nums[mid-1]) {
                    return mid;
                }
            }
            if(nums[mid]<nums[mid+1]) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return s;
    }
}