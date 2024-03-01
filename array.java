import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] array = new int[3][3];

        // for taking input we will use for loop
        System.out.println("enter you input:");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<3;j++) {
                array[i][j] = sc.nextInt();
            }
        }

       for (int[] n:array) {
           System.out.println(Arrays.toString(n));
       }
    }}
