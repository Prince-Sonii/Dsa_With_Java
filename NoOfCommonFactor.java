class NoOfCommonFactor {
    // we are finding the total number of common factor of two number
    //for ex 12,6 have 1,2,3,6 so the total number is=4
    public static void main(String[] args) {
        System.out.println(commonFactors(12,6));
    }
    static int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=Math.sqrt(a*b);i++) {
            if(a%i==0&&b%i==0) {
                count++;
            }

        }
        return count;
    }
}