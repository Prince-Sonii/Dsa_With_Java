import java.util.Arrays;

class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    //solution
    static int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*(nums.length)];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    
}