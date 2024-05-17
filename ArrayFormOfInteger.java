import java.util.ArrayList;
import java.util.Arrays;

class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr,1));
    }
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=num.length-1;i>-1;i--) {
            int sum=0;
            int gSum=0;
            if(k>0) {
                sum = sum+(k%10);
            }
            if(num[i]+sum>9) {
                gSum = (num[i]+sum);
                ans.add(0,gSum%10);
                gSum/=10;
                k/=10;
                k+=gSum;
            } else {
                ans.add(0,num[i]+sum);
                k/=10;
            }
        }
        while(k>0) {
            ans.add(0,k%10);
            k/=10;
        }
        return ans;
    }
}