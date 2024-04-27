class GCD {
    public static void main(String[] args) {
        int []nums = {2,3,4,5,6,7,10};
        System.out.println(findGCD(nums));
    }
    static int findGCD(int[] nums) {
        int a_smallest=nums[0];
        int b_largest =nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]>b_largest) {
                b_largest=nums[i];
            }
            if(nums[i]<a_smallest) {
                a_smallest = nums[i];
            }
        }
        return gcd(a_smallest,b_largest);
    }
    static int gcd(int a,int b) {
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
}