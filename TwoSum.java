import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i =1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i] == target) {
                    return new int[]{j,j-i};
                }
            }
        }
        return new int []{};
        
    }
}