import java.util.Arrays;

class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    //solution
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for(int i=0;i<nums.length;i++) {
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++) {
            arr[i] += arr[i-1];
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                nums[i] =0;
            } else {
                nums[i] = arr[nums[i]-1];
            }
        }
        return nums;
    }
}