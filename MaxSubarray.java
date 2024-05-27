import java.util.Arrays;

class MaxSubarray {
    public static void main(String[] args) {
        int[]nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    // Qno. 53

    static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            maxSum=sum>maxSum?sum:maxSum;
            sum=sum<0?0:sum;
        }
        return maxSum;
    }
}