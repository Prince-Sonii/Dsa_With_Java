class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    //solution
    static int arrangeCoins(int n) {
        int row=n;
        int count=0;
        for(int i=1;i<=n;i++) {
            if(i<=row) {
                row-=i;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}