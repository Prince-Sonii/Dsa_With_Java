class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;) {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        int ans =0;
        for(int index=0;index<nums.length;index++) {
            if(nums[index]!=index+1) {
                ans = nums[index];
            }
        }
        return ans;
    }
}