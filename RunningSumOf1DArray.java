import java.util.Arrays;

class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int [] ans = runningSum(num);
        System.out.println(Arrays.toString(ans));
    }
    //solution
    static int[] runningSum(int[] nums) {
        int sum=0;
        int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
           sum=sum+nums[i];
           nums2[i]=sum;
        }
        return nums2;
        
    }
}