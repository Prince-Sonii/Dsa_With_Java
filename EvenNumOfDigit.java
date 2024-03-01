public class EvenNumOfDigit {
    public static void main(String[] args) {
        int[] array = {1,2,3,33,456,7890,3455,22,67,990,123};
        System.out.println(EvenDigit(array));
    }
    static int EvenDigit(int []array) {
        int count_Digit=0;
        for (int i=0;i< array.length;i++) {
            /* method 1
            int div_count=0;
            while(array[i]>0) {
                div_count++;
                array[i]=array[i]/10;
            }*/
            //method 2
            int check =(int)(Math.log10(array[i]))+1;
            if(check%2==0) {
                count_Digit++;
            }
        }
        return count_Digit;
    }
}
