class HighestAltitude {
    public static void main(String[] args) {
        int [] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int prev=0;
        int ans=0;
        for(int i=0;i<gain.length;i++) {
            prev = prev+gain[i];
            if(prev>-1 && prev>ans) {
                ans = prev;
            }
        }
        return ans;
    }
}