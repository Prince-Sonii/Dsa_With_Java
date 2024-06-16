import java.util.Arrays;

class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int index = 1;
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i]!=nums[i+1]) {
                index++;
            }
            if(index==3) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}