import java.util.Arrays;

class MaxProdOfThreeNum {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,60};//[-100,-98,-1,2,3,4] test case for help
        System.out.println(maximumProduct(nums));
    }
    static int maximumProduct(int[] nums) {
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int max3= Integer.MIN_VALUE;
        int negMax1 = 0;
        int negMax2 = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>max1) {
                max3 = max2;
                max2 = max1;
                max1=nums[i];
            }
            else if(nums[i]>max2) {
                max3=max2;
                max2=nums[i];
            } else if(nums[i]>max3) {
                max3=nums[i];
            }
            if(nums[i]<negMax1) {
                negMax2 = negMax1;
                negMax1 = nums[i];
            } else if(nums[i]<negMax2) {
                negMax2 = nums[i];
            }
        }
        return Math.max(max1*negMax1*negMax2,max1*max2*max3);
    }
}