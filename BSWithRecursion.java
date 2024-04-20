public class BSWithRecursion {
    public static void main(String[] args) {
        int[]nums = {1,2,4,5,6,7,8};
        System.out.println(BS(nums,1,0, nums.length-1));
    }
    static int BS(int[]array,int target,int s, int e) {
        if(s>e) {
            return -1;
        }
        int m = s+(e-s)/2;
        if (target==array[m]) {
            return m;
        }
        if (target>m) {
            return BS(array,target,m+1,e);
        }
        return BS(array,target,s,m-1);

    }
}
