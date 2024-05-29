class RemoveDuplicate {
    public static void main(String[] args) {
        int[]nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=1;j<nums.length;j++) {
            if (nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        
    }
}