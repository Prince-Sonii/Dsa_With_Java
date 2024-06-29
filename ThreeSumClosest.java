import java.util.Arrays;

class ThreeSumClosest {
    public static void main(String[] args) {
        int [] arr = {4,0,5,-5,3,3,0,-4,-5};//extra test case for practice
        System.out.println(threeSumClosest(arr,-2));
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }

            int start=i+1;
            int end = nums.length-1;

            while(start<end) {
                int total = nums[i]+nums[start]+nums[end];
                if(total==target) {
                    return total;
                }
                if(Math.abs(target-total)<Math.abs(target-ans)) {
                    ans = total;
                }
                if(total<target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return ans;
    }
}