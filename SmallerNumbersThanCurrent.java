import java.util.Arrays;

class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    //solution
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int countSmaller = 0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            countSmaller = 0;
            for(int j=0;j<nums.length;j++) {
                if(nums[i]>nums[j]) {
                    countSmaller++;
                }
            }
            ans[i]=countSmaller;
        }
        return ans;
    }
}