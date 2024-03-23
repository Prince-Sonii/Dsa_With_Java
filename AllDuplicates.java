import java.util.List;
import java.util.ArrayList;
class AllDuplicates {
    public static void main(String[] args) {
        int [] array = {4,3,2,7,8,2,3,1};
        List<Integer> ansDup = findDuplicates(array);
        System.out.println(ansDup);
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while(i<nums.length) {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index<nums.length;index++) {
            if(nums[index]!=index+1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    } 
}