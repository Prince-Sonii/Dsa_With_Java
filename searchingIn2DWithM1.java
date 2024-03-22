import java.util.Arrays;

public class searchingIn2DWithM1 {
    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,40},
                {11,22,33,44},
                {111,222,333,444},
                {1111,2222,3333,4444}
        };
        int[] ans = search(matrix, 33);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][]nums, int target) {
        int rowStart=0;
        int colEnd = nums.length-1;

        while(rowStart< nums.length && colEnd>=0) {
            if(nums[rowStart][colEnd]<target) {
                rowStart++;
            }
            else if(nums[rowStart][colEnd]>target) {
                colEnd--;
            } else {
                return new int[]{rowStart,colEnd};
            }
        }
        return new int[]{-1,-1};
    }
    }

