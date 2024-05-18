class RotatedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1},
                {1,0}
        };
        int[][] target = {
                {1,0},
                {0,1}
        };
        System.out.println(findRotation(mat,target));

    }
    //solution
    static boolean findRotation(int[][] mat, int[][] target) {
        return helper(mat,target,1);
    }
    static boolean helper(int[][] mat,int[][] target, int count) {
        if(count>4) {
            return false;
        }
        int[][] ans = new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++) {
            for(int j=mat.length-1;j>=0;j--) {
                ans[(mat.length-1)-j][i] = mat[i][j];
            }
        }
        mat=ans;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) {
                if(ans[i][j]!=target[i][j]) {
                    return  helper(mat,target,count+1);
                }
            }
        }
        return true;

    }
}