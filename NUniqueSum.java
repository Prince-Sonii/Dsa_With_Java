import java.util.Arrays;

class NUniqueSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    //Solution
    static int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        if(n==1) {
            return new int[]{0};
        }
        for(int i=-1;i>-n;i--) {
            if(index==n/2) {
                break;
            }
            ans[index] = i;
            index++;
        }
        if(n%2!=0) {
            ans[index]=0;
            index++;
        }
        for(int i=1;i<n;i++) {
            if(index==n) {
                break;
            }
            ans[index] =i;
            index++;
        }
        return ans;
    }
}