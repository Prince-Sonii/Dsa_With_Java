import java.util.Arrays;

class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };
        int[][]ans = transpose(mat);
        for (int[]arr:ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int [][] t = new int[matrix[0].length][matrix.length];
        int k=0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                t[j][k] = matrix[i][j];
            }
            k++;
        }
        return t;
    }
}