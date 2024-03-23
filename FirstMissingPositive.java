class FirstMissingPositive {
    // we are finding the smallest positive number that is missing in array
    public static void main(String[] args) {
        int []array1 = {3,4,-1,1};//missing is 2
        int []array2 = {7,8,9,11,12};//missing is 1 because smallest positive number
        int [] array3 = {1,2};//missing is 3 because the array is sorted and after 2 only 3 is smallest
        int ans1 = firstMissingPositive(array1);
        System.out.println(ans1);
        int ans2 = firstMissingPositive(array2);
        System.out.println(ans2);
        int ans3 = firstMissingPositive(array3);
        System.out.println(ans3);
    }
    // code for given method
    static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length) {
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for(int index = 0;index<nums.length;index++) {
            if(nums[0]<0 && nums[0]>nums.length) {
                return 1;
            }
            if(nums[index]!=index+1) {
                return index+1;
            }
        }
        return nums[nums.length-1]+1;
    }
}