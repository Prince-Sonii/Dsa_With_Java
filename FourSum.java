import java.util.ArrayList;
import java.util.Arrays;

class FourSum {
    public static void main(String[] args) {
        int[]arr = {1000000000,1000000000,1000000000,1000000000};//Good extra test case for practice
        System.out.println(fourSum(arr,-294967296));
    }
    static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j=i+1;j<nums.length;j++) {
                if(j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int start = j+1;
                int end = nums.length-1;
                while(start<end) {
                    long sum = ((long)nums[i])+((long)nums[j])+((long)nums[start])+((long)nums[end]);
                    if(sum==target) {
                        ans.add(new ArrayList<>());
                        ans.get(index).add(nums[i]);
                        ans.get(index).add(nums[j]);
                        ans.get(index).add(nums[start]);
                        ans.get(index).add(nums[end]);
                        index++;
                        start++;
                        while(nums[start]==nums[start-1] && start<end) {
                            start++;
                        }
                        end--;
                    }
                    else if(sum<target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ans;
    }
}