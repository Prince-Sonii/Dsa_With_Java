public class SearchInsertPosition {
    // leet code question no.35
    /*Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not, return the
    index where it would be if it were inserted in order
     */
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target =5;
        System.out.println(searchInsert(nums,target));
    }
    //solution
    static int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(nums[mid]>target) {
                e=mid-1;
            } else{
                s=mid+1;
            }
        }
        return s;
    }
}
