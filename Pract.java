import java.util.Arrays;
public class Pract {
    public static void main(String[] args) {
        //array accessing elements by for each loop
        /*int [] arr = {1,2,3,4,5,6,7};
        for(int element:arr) {
            System.out.println(element);
            */
         // sorting an array then findind index of given number
        int [] myArray = {10,2,55,67,32,12};
        //sorting of aaray
        Arrays.sort(myArray);
        int toFindIndexOf = 3;
        int indexValue = Arrays.binarySearch(myArray,toFindIndexOf);
        if (indexValue<0) {
            System.out.println("Given value is not present in array");
        }
        else {
            System.out.println(toFindIndexOf + "'s index is = " + indexValue);
            }

        }
    }
