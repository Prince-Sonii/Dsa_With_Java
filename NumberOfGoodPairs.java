class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] array = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(array));
    }
    static int numIdenticalPairs(int[] nums) {
        int countGoodPairs = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]==nums[j]) {
                    countGoodPairs++;
                }
            }
        }
        return countGoodPairs;
    }
}