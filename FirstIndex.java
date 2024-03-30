class FirstIndex {
    public static void main(String[] args) {
        String a = "sadbutsad";
        String b = "sad";
        int ans = strStr(a,b);
        System.out.println(ans);

    }
    static int strStr(String haystack, String needle) {
       return haystack.indexOf(needle);
    }
}