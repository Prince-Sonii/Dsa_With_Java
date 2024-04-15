class PalindromeBreak {
    //leetcode 1328s
    public static void main(String[] args) {
        String name = "aaaaaa";
        String ans = breakPalindrome(name);
        System.out.println(ans);

    }
    static String breakPalindrome(String palindrome) {
        int i=0;
        int replace =0;
        int mid = palindrome.length()/2;
        StringBuilder ans = new StringBuilder();
        ans.append(palindrome,0,palindrome.length());
        while(i<palindrome.length()) {
            if (palindrome.length()==1) {
                break;
            }
            if(i==mid) {
                replace = palindrome.charAt(palindrome.length()-1)+1;
                ans.setCharAt(palindrome.length()-1,(char)replace);
                return ans.toString();
            }
            if(palindrome.charAt(i)!='a') {
                ans.setCharAt(i,'a');
                return ans.toString();
            } else {
                i++;
            }
        }
        return new String("");
    }
}