import java.util.ArrayList;
import java.util.Arrays;

class CreateTargetArray {
    public static void main(String[] args) {
        int[] num = {1,2,0,3};
        int [] index = {0,1,2,2};
        int [] target = createTargetArray(num,index);
        System.out.println(Arrays.toString(target));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0;i<index.length;i++) {
            // if index repeat then it will shift the all values to the right of the index value
            newList.add(index[i],nums[i]);
        }
        int[] target = new int[newList.size()];
        for(int j=0;j<newList.size();j++) {
            target[j] = newList.get(j);
        }
        return target;
    }
}