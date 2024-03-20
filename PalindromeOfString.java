public class PalindromeOfString {
    public static void main(String[] args) {
        String checkString = "abcba";
        System.out.println(checkPalindrome(checkString));
        String checkString2 = "abcab";
        System.out.println(checkPalindrome(checkString2));
    }
    static boolean checkPalindrome(String ch) {
        /*
        in this method we are checking first and last index of string if both are equal then,
        we will increase first index and decrease last index and if first and last index are
        not equal at any point then,
        it will return true otherwise after completion of loop this method will return true
         */
        int start=0;
        int end=ch.length()-1;

        while(start<=end) {
            //we are using here == not .equals because we are not creating any new object here
            if (ch.charAt(start)==ch.charAt(end)) {
                start++;
                end--;
            }else  {
                return false;
            }
        }
        return true;
    }
}
