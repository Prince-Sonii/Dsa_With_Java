class ValidSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }
    //solution
    static boolean isPerfectSquare(int num) {
        long s=0;
        long e = num;
        while(s<=e) {
            long mid = (s+e)/2;
            if(mid*mid==num) {
                return true;
            }
            if(mid*mid>num) {
                e=mid-1;
            } else {
                s=mid+1;
            }
        }
        return false;
    }
}