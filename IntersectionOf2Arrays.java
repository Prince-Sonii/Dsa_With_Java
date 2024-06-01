import java.util.ArrayList;
import java.util.Arrays;

class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] nums1 ={1,2,2,1};
        int[] nums2 ={2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    if(ans.indexOf(nums1[i])<0) {
                        ans.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}