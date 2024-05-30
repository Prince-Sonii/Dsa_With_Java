import java.util.Arrays;

class ReshapeMatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        int r = 1;
        int c =4;
        int[][] ans = matrixReshape(mat, r, c);
        for(int[]arr:ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col!=r*c) {
            return mat;
        }
        if(r==row && c==col) {
            return mat;
        }
        int [][] ans = new int[r][c];
        int position=0;
        while(position < r*c) {
            ans[position/c][position%c] = mat[position/col][position%col];
            position++;
        }
        return ans;
    }
}