class PalindromeBreak {
    //leetcode 1328s
    public static void main(String[] args) {
        String testCase1 = "abccba";
        String testCase2 = "aa";
        System.out.println(breakPalindrome(testCase1));
        System.out.println(breakPalindrome(testCase2));


    }
    static String breakPalindrome(String palindrome) {
        StringBuilder ans = new StringBuilder();
        ans.append(palindrome,0,palindrome.length());
        if (palindrome.length()<2) {
            return new String("");
        }

        for(int i=0;i<=palindrome.length()/2;i++) {
            if(palindrome.charAt(i)!='a') {
                ans.setCharAt(i,'a');
                return ans.toString();
            }
        }
        ans.setCharAt(palindrome.length()-1,'b');
        return ans.toString();
    }
}