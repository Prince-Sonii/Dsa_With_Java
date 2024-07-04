import java.lang.reflect.Array;
import java.util.Arrays;

class LargestNumber {
    public static void main(String[] args) {
        int[]nums = {8308,8308,830};// extra test case
        System.out.println(largestNumber(nums));
    }
    static String largestNumber(int[] nums) {
        String[] ref = new String[nums.length];
        for(int i=0;i<nums.length;i++) {
            ref[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ref, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder ans = new StringBuilder();
        for(String element:ref) {
            ans.append(element);
        }
        return ans.toString().startsWith("0") ? "0":ans.toString();
    }
}