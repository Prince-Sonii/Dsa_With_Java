class ReverseStringThree {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s,0,s.length());
        str.reverse();
        String[] ref = str.toString().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<ref.length;i++) {
            ans.insert(0,ref[i]+" ");
        }
        return ans.toString().trim();
    }
}