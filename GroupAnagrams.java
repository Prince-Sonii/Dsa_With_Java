import java.util.ArrayList;
import java.util.Arrays;

class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};//extra test case
        System.out.println(groupAnagrams(strs));
    }
    static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        boolean[] handle = new boolean[strs.length];
        System.out.println(Arrays.toString(strs));
        String[] sortedStrs = new String[strs.length];
        int index=0;
        for (int i = 0; i <strs.length; i++) {
            if (!handle[i]) {
                ans.add(new ArrayList<>());
                ans.get(index).add(strs[i]);
                handle[i] = true;
                for (int j = 0; j < strs.length; j++) {
                    if (!handle[j] && checkEquality(strs[i],strs[j])) {
                        ans.get(index).add(strs[j]);
                        handle[j] = true;
                    }
                }
                index++;
            }
        }
        return ans;
    }
    static boolean checkEquality(String a, String b) {
        if (a.length()!=b.length()) {
            return false;
        }
        char[] first = new char[a.length()];
        char[] second = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            first[i] = a.charAt(i);
            second[i] = b.charAt(i);
        }
        Arrays.sort(first);
        Arrays.sort(second);
        for (int i = 0; i < a.length(); i++) {
            if (first[i]!=second[i]) {
                return false;
            }
        }
        return true;
    }
}