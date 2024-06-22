import java.util.Arrays;

class RelativeSortArray {
    public static void main(String[] args) {
        int[]arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[]arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        int[]ans = new int[arr1.length];
        for(int i=0;i<arr1.length;i++) {
            nums[arr1[i]] +=1;
        }
        int ansIndex = 0;
        int startIndex2=0;
        for(int i=0;i<arr2.length;i++) {
            while(nums[arr2[i]]>0) {
                ans[ansIndex] = arr2[i];
                ansIndex++;
                nums[arr2[i]]--;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                while(nums[i]>0) {
                    ans[ansIndex] = i;
                    ansIndex++;
                    nums[i]--;
                }
            }
        }
        return ans;
    }
}