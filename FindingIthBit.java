public class FindingIthBit {
    public static void main(String[] args) {

        System.out.println("the ith bit is: "+iThBit(10,3));
    }
    static int iThBit(int n, int i) {
        int ans = n&(int)Math.pow(2,i-1);
        /*
        int ans = n|(int)Math.pow(2,i-1);
        if we put or int between then it will convert the ith bit to 1
         */
        if (ans==0) {
            return 0;
        }
        return ans;
    }
}
