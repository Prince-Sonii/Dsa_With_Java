public class SearchInsertPosition {
    // leet code question no.35
    /*Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, 0return the
    index where it would be if it were inserted in order
     */
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int [] nums2 = {1,5,6};
        int res1 = searchInsert(nums, 2);
        int res2 = searchInsert(nums2,7);
        System.out.println(res1);
        System.out.println(res2);


    }
    //solution
    static int searchInsert(int[] nums, int target) {
        // finding the target by traversing the array
        for(int i=0;i<nums.length;i++ ) {
            if(nums[i]==target) {
                return i;
            }
        }
        // code for inserting the target at correct indedx if it is not in array
        for(int i=0;i<nums.length;i++) {
            if(target<nums[i]) {
                return i;
            }
        }
        //if the target is greater than all numbers in array then it will be inserted at the last
        return nums.length;
    }
}
