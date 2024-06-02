import java.util.Arrays;

class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int index1=0;
        int index2=0;
        int totalCandies1 = 0;
        int totalCandies2 = 0;
        int ans1=0;
        int ans2=0;
        for(int i=0;i<aliceSizes.length;i++) {
            totalCandies1+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++) {
            totalCandies2+=bobSizes[i];
        }
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        // here the long setences are only the variable names
        while(index1<aliceSizes.length && index2<bobSizes.length) {
            if((totalCandies1-aliceSizes[index1]+bobSizes[index2])>(totalCandies2-bobSizes[index2]+aliceSizes[index1])) {
               index1++;
            } else if((totalCandies1-aliceSizes[index1]+bobSizes[index2])<(totalCandies2-bobSizes[index2]+aliceSizes[index1])) {
                index2++;
            }
            else {
                ans1=index1;
                ans2=index2;
                break;
            }
        }
        return new int[]{aliceSizes[ans1],bobSizes[ans2]};
    }
}