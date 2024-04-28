class NumberPalindrome {
    public static void main(String[] args) {
        //negatives are not a palindrome
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(-1));
    }
    static boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int rev = reverse(x);
        return rev==x;
    }
    static int reverse(int n) {
        if(n%10==n) {
            return n;
        }
        int digit = (int)Math.log10(n)+1;
        return (n%10)*(int)(Math.pow(10,digit-1))+reverse(n/10);
    }
}