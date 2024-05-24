import java.util.Arrays;

class ReverseString {
    public static void main(String[] args) {
        char[] c = {'a','b','c'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }
    //Solution
    static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
}