import java.util.Arrays;

class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int sIndex = 0;
        int sAns = 0;
        int eAns = ans.length-1;
        while(sIndex<nums.length) {
            if(nums[sIndex]%2==0) {
                ans[sAns] = nums[sIndex];
                sAns++;
            } else {
                ans[eAns] = nums[sIndex];
                eAns--;
            }
            sIndex++;
        }
        return ans;
    }
}