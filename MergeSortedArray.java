import java.util.Arrays;

class MergeSortedArray {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int[]nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];
        int index1=0;
        int index2=0;
        int index = 0;
        while(index1<m && index2<n) {
            if(nums1[index1]<nums2[index2]) {
                arr[index]= nums1[index1];
                index1++;
            } else {
                arr[index] = nums2[index2];
                index2++;
            }
            index++;
        }
        while(index1<m) {
            arr[index] = nums1[index1];
            index1++;
            index++;
        }
        while(index2<n) {
            arr[index] = nums2[index2];
            index2++;
            index++;
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = arr[i];
        }
    }
}