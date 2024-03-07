public class indexInMountainArray {
    // we will find the least index of given target in mountain array
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,3,2,1};
        //it will give us initial or the smallest index of given target
        int ans = findInMountainArray(2,array);
        //we can see that the value 2 is at 1st and 6th index
        //But it will index 1 in answer because the initial index of target is 1
        System.out.println(ans);

    }
    static int findInMountainArray(int target, int[] mountainArr) {

        int initialIndex = tillPeakIndex(target, mountainArr);
        int lastIndex = afterPeakIndex(target, mountainArr);
        if(initialIndex==-1) {
            return lastIndex;
        }
        return initialIndex;

    }


    static int peakIndex(int[] mountainArr) {
        int start =0;
        int end = mountainArr.length-1;
        while(start<end) {
            int mid = start+(end-start)/2;
            if(mountainArr[mid]>mountainArr[mid+1]) {
                end = mid;
            }
            else {
                start =mid+1;
            }
        }
        return end;
    }

    static int afterPeakIndex(int target, int[] mountainArr) {
        int start = peakIndex(mountainArr);
        int end = mountainArr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target==mountainArr[mid]) {
                return mid;
            }
            if(mountainArr[mid]>target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;

    }
    static int tillPeakIndex(int target , int[] mountainArr) {
        int start = 0;
        int end = peakIndex(mountainArr);
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target==mountainArr[mid]) {
                return mid;
            }
            if(mountainArr[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;

    }
}
