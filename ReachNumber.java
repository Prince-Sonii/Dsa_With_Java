class ReachNumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }
    static int reachNumber(int target) {
        int step = 1;
        int num=0;
        target=Math.abs(target);
        while(num<target) {
            num+=step;
            step++;
        }
        while((num-target)%2 == 1) {
            num+=step;
            step++;
       }
       return step-1;
    }
}