import java.util.Arrays;

public class FirstLastElement {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        int []output = searchRange(nums,target);
        System.out.println(Arrays.toString(output));

    }
    static int[] searchRange(int[] nums, int target) {
        int [] ans ={-1,-1};
        //for start index make startIndex: true
        ans[0] = search(nums, target, true);
        if (ans[0]!=-1) {
            // for end index of element make startIndex: false
            ans[1] = search(nums, target, false);
        }

        return ans;
    }
    static int search(int[] nums, int target, boolean startIndex) {

        int start =0;
        int end = nums.length-1;
        int ans =-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if (target<nums[mid]) {
                end = mid-1;
            }
            else if(target>nums[mid]) {
                start = mid+1;
            }
            else {
                ans = mid;
                if (startIndex) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;

        }
}
