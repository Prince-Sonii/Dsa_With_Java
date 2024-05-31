class CountingNegNumber {
    public static void main(String[] args) {
        int[][]grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int count =0;
        while(row<grid.length && col>=0) {
            if(grid[row][col]<0) {
                count+=grid.length-row;
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}