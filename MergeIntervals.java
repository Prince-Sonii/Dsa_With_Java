import java.util.ArrayList;
import java.util.Arrays;

class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};// extra test case
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    static int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][2];
        ArrayList<ArrayList<Integer>> tempAns = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        for (int i = 0; i < intervals.length;i++) {
            ans[i][0] = intervals[i][0];
            ans[i][1] = intervals[i][1];
            for (int j = i+1; j < intervals.length; j++) {
                if (ans[i][1]>=intervals[j][0]) {
                    if (intervals[j][1]>ans[i][1]) {
                        ans[i][1] = intervals[j][1];
                    }
                }else {
                    break;
                }
            }
        }

        int count =1;
        int row=0;
        for (int i = 1; i < ans.length; i++) {
            if(ans[i][1]>ans[row][1]) {
                row=i;
                count++;
            }
        }

        int[][] finalAns = new int[count][2];
        finalAns[0][0] = ans[0][0];
        finalAns[0][1] = ans[0][1];
        for (int i = 1; i < finalAns.length; i++) {
            for (int j = 1; j < ans.length; j++) {
                if(ans[j][0]>finalAns[i-1][1]) {
                    finalAns[i][0] = ans[j][0];
                    finalAns[i][1] = ans[j][1];
                    break;
                }
            }
        }
        return finalAns;
    }
}