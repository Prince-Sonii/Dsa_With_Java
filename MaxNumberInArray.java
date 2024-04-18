public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] array ={1,22,3,4,5,66,4,77,8,9};
        maxNumber(array);

    }
    static void maxNumber(int[]array) {
        int num = array[0];
        int index =0;
        for (int i=1;i<array.length;i++) {
         if (num<array[i]) {
             num=array[i];
             index = i;
         }

        }
        System.out.print("the max number is:"+num+"at the index:"+index);


}
}
