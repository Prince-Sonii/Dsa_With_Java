class Solution_1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(25));
    }
    static int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        while(n>0) {
            prod*=n%10;
            sum+= n%10;
            n/=10;
        }
        return prod-sum;
    }
}