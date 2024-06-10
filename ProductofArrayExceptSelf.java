import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));//[[0,0,1,2,3,0] extra test case for help
    }
    static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                product*=nums[i];
            } else {
                count++;
            }
        }
        if(count>0) {
            for(int i=0;i<nums.length;i++) {
                if(count >1) {
                    nums[i]=0;
                }
                else if(nums[i]==0) {
                    nums[i] = product;
                } else {
                    nums[i] =0;
                }
            }
        } else {
            for(int i=0;i<nums.length;i++) {
                nums[i] = product/nums[i];
            }
        }
        return nums;
    }
}