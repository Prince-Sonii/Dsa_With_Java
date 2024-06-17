import java.util.Arrays;

class SortArrayByParity2 {
    public static void main(String[] args) {
        int[]nums= {4,1,2,1};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int index =0;
        int start=0;
        int end = nums.length-1;
        while(index<nums.length) {
            if(nums[index]%2==0) {
                ans[start] = nums[index];
                start++;
            } else {
                ans[end] = nums[index];
                end--;
            }
            index++;
        }
        index=0;
        start=0;
        end=nums.length-1;
        while(index<nums.length) {
            if(index%2==0) {
                nums[index] = ans[start];
                start++;
            } else {
                nums[index] = ans[end];
                end--;
            }
            index++;
        }
        return nums;
    }
}