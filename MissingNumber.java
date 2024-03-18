public class MissingNumber {
    public static void main(String[] args) {
        int [] array = {3,0,2,1};
        int ans = sorting(array);
        System.out.println(ans);
    }
    static int sorting(int[]array) {
        // we are finding missing number from range 0-N
        int ans =0;
        for(int i=0;i< array.length;) {

            if (array[i]==0. && i<array.length) {
                ans=i+1;
                i++;
            }
            else if (array[i]-1!=i) {
                int temp = array[array[i]-1];
                array[array[i]-1] = array[i];
                array[i] = temp;
            } else {
                i++;
            }
        }
        return ans;
    }
}
