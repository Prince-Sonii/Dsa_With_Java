import java.util.Arrays;

class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
    static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        int i=0;
        int index=0;
        while(i<nums.length) {
            ans[i] = nums[index];
            ans[i+1] = nums[n];
            i+=2;
            index++;
            n++;
        }
        return ans;
    }
}