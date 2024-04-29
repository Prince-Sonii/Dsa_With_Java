class StepsToReduceTo0 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
    }
    static int numberOfSteps(int num) {
        int countSteps =0;
        return helper(num,countSteps);
    }
    static int helper(int num, int count) {
        if(num==0) {
            return count;
        }
        if(num%2==0) {
            return helper(num/2,count+1);
        }            
        return helper(num-1,count+1);

    }
}