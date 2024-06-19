import java.util.Arrays;

class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int index =ans.length-1;
        int startIndex = 0;
        int endIndex = nums.length-1;
        while(index>-1) {
            if(Math.abs(nums[startIndex])>Math.abs(nums[endIndex])) {
                ans[index] = nums[startIndex]*nums[startIndex];
                startIndex++;
            } else {
                ans[index] = nums[endIndex]*nums[endIndex];
                endIndex--;
            }
            index--;
        } 
        return ans;
    }
}