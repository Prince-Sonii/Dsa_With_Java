class OddValueInMatrix {
    public static void main(String[] args) {
        int[][] ind = {{0,1},{1,1}};
        System.out.println(oddCells(2,3,ind));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] initial = new int[m][n];
        for(int i=0;i<indices.length;i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for(int a=0;a<initial[row].length;a++) {
                initial[row][a]++;
            }
            for(int b=0;b<initial.length;b++) {
                initial[b][col]++;
            }
        }
        int count=0;
        for(int k=0;k<initial.length;k++) {
            for(int l=0;l<initial[k].length;l++) {
                if(initial[k][l]%2!=0) {
                    count++;
                }
            }
        }
        return count;
    }
}