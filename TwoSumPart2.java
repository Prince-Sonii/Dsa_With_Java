import java.util.Arrays;

class TwoSumPart2 {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num,target)));
    }
    //solution
    static int[] twoSum(int[] numbers, int target) {
        for(int i=1;i<numbers.length;i++) {
            for(int j=i;j<numbers.length;j++) {
                if(numbers[j]+numbers[j-i]==target) {
                    return new int[]{j-i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}