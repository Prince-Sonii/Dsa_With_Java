public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,44,9};
        System.out.println("target found at index number:"+LinearSearch(arr,41));

    }
    static int LinearSearch(int[] array, int target) {
        int index =0;
        if(array.length==0) {
            return -1;
        }
        for (int i=0;i< array.length;i++) {
            if (array[i]==target) {
                return i;
            }

        }
        //this line will run if none of the return statement above have executed
        return -1;
    }
}
