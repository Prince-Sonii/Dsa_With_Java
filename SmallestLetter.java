public class SmallestLetter {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {
        char[] array = {'c','f','j'};
        char ans = nextGreatestLetter(array,'c');
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        /*
        we can use this also if we don't put % operator at the return function
        if(target>=letters[end]) {
            return letters[0];
        }
         */

        while(start<=end) {
            int mid = start + (end-start)/2;
            /* in binary search we use only > operator but here we used >= because in the Q they
             mentioned that they only want greater than element
             */
            if(target>=letters[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        //used % so if the target is greater every element in array then it will return array[0]
        return letters[start%letters.length];

    }
}
