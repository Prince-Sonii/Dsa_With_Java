import java.util.ArrayList;
import java.util.Arrays;

class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies ={1,2,4,6,7,2};
        System.out.println(kidsWithCandies(candies,3));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = 0;
        for(int i=0;i<candies.length;i++) {
            if(candies[i]>greatestCandies) {
                greatestCandies = candies[i];
            }
        }
        ArrayList<Boolean> result =  new ArrayList<>();
        for(int j=0;j<candies.length;j++) {
            if(candies[j]+extraCandies>=greatestCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}