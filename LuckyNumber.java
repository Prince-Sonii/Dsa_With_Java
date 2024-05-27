import java.util.ArrayList;

class LuckyNumber {
    public static void main(String[] args) {
        int [][]matrix = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };
        System.out.println(luckyNumbers(matrix));
    }
    static ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++) {
            int minFromRowIndex = 0;
            boolean maxFromElement =true;
            int minFromRow = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]<=minFromRow) {
                    minFromRow = matrix[i][j];
                    minFromRowIndex=j;
                }
            }
            // here we'll get the minimun element from ith row
            //now we have to check that the minimum element from the row is maximum in column or not
            for(int k=0;k<matrix.length;k++) {
                if(matrix[i][minFromRowIndex]<matrix[k][minFromRowIndex]) {
                    maxFromElement = false;
                    break;
                }

            }
            if(maxFromElement) {
                list.add(matrix[i][minFromRowIndex]);
            }
        }
        return list;
    }
}