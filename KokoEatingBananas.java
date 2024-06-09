import java.util.Arrays;

class KokoEatingBananas {
    public static void main(String[] args) {
        int[]piles = {805306368,805306368,805306368};//extra test case for help[test case no.125]
        System.out.println(minEatingSpeed(piles,1000000000));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int maxElement =0;
        for(int element:piles) {
            if(element > maxElement) {
                maxElement = element;
            }
        }
        int s =1;
        int e = maxElement;
        while(s<=e) {
            int mid = s+(e-s)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++) {
                if(sum>h) {
                    break;
                }
                if(piles[i]%mid==0) {
                    sum+=piles[i]/mid;
                } else {
                    sum+=(piles[i]/mid)+1;
                }

            }
            if(sum<=h) {
                e=mid-1;
            } else {
                s = mid+1;
            }
        }
        return s;
    }
}