public class CeilingNumber {
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int res = cNum(arr,15);
        System.out.println(res);

    }
    static int cNum(int [] array,int target) {
        int start =0;
        int end = array.length-1;
        if(target>array[end]) {
            return -1;
        }
        while (start <=end) {
            int mid = start + (end-start)/2;
            if (target==array[mid]) {
                return mid;
            }
            if (target>array[mid]) {
                start = mid+1;
            }
            else {
                end =mid-1;
                }
            }
        return start;

        }

    }
