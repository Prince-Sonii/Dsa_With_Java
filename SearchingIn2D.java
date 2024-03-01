import java.util.Arrays;
public class SearchingIn2D {
    public static void main(String[] args) {
        int[][] array ={

                {1,2,3,4},
                {11,22,33,44},
                {50,60}
        };
        int[] result=LinearSearch(array,33);
        System.out.println(Arrays.toString(result));

    }
    static int[] LinearSearch(int[][]array,int target) {
        if (array.length==0) {
            return new int[]{-1, -1};
        }
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j]==target) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
