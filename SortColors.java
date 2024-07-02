import java.util.Arrays;

class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortColors(int[] nums) {
        int[] counting = new int[3];
        for(int element:nums) {
            counting[element]++;
        }
        int index=0;
        for(int i=0;i<nums.length;i++) {
            while(counting[index]==0) {
                index++;
            }
            nums[i] = index;
            counting[index]--;  
        }
    }
}