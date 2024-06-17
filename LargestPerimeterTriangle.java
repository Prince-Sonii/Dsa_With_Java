import java.util.Arrays;

class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[]nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--) {
            int side1 = nums[i];
            int side2 = nums[i-1];
            int side3 = nums[i-2];
            if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2 ) {
                return side1+side2+side3;
            }
        }
        return 0;
    }
}