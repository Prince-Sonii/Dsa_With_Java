import java.util.Arrays;

public class binarySearchIn2D {
    public static void main(String[] args) {
        int [][] arrays = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(reducingRows(arrays,2)));


    }
    static int[] binarySearch(int[][]array, int sRow,int sCol, int eCol, int target) {
        while(sCol<=eCol) {
            int midColumn = sCol + (eCol-sCol)/2;
            if(array[sRow][midColumn]>target) {
                eCol = midColumn-1;
            } else if (array[sRow][midColumn]<target) {
                sCol = midColumn+1;
            }
            else {
                return new int[]{sRow,midColumn};
            }
        }
        return new int[]{-1,-1};

    }
    // now we will make only two row from where we can find the target
    static int[] reducingRows(int[][]array, int target){
        int sRow = 0;
        int eRow = array.length-1;
        int cols = array[0].length-1;
        //finding the middle column
        int midCol = cols/2;
        if (array.length==1) {
            return binarySearch(array, sRow, 0, cols, target);
        }
        while(sRow<eRow-1) {
            int midRow = sRow + (eRow-sRow)/2;
            if(array[midRow][midCol]==target) {
                return new int[]{midRow,midCol};
            }
            if(array[midRow][midCol]>target) {
                eRow = midRow;
            }
            else {
                sRow = midRow;
            }
        }
        //code for those 2 rows which is remaining after the while loop
        if(array[sRow][midCol]==target) {
            return new int[]{sRow,midCol};
        }
        if(array[sRow+1][midCol]==target) {
            return new int[]{sRow+1,midCol};
        }
        // code for remaining 4 side section other than the middle ones
        // for section 1
        if(array[sRow][midCol]>target) {
            return binarySearch(array, sRow,0,midCol-1,target);
        }
        // for section 2
        if(array[sRow][midCol]<target && array[sRow][cols]<=target) {
            return binarySearch(array,sRow,midCol+1,cols,target);
        }
        // for section 3
        if(array[sRow+1][midCol]>target) {
            return binarySearch(array,sRow+1,0,midCol-1,target);
        }
        //for section 4
        if(array[sRow+1][midCol]<target) {
            return binarySearch(array,sRow+1,midCol+1,cols,target);
        }

        return new int[]{-1,-1};

    }
}