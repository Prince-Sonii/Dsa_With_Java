class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        boolean[][] arr =  new boolean[mat.length][mat.length];
        int rowP = 0;
        int col = 0;
        int rowS = mat.length-1;
        int ans=0;
        while(rowP<mat.length) {
            ans+=mat[rowP][col];
            arr[rowP][col]=true;
            if(!arr[rowS][col]) {
               ans+=mat[rowS][col];
            } 
            rowP++;
            col++;
            rowS--;
        }
        return ans;
    }     
}
