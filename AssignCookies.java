import java.util.Arrays;

class AssignCookies {
    public static void main(String[] args) {
        int[]g={1,2,3};
        int[]s={1,1};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ig=0;
        int is=0;
        int count=0;
        while(ig<g.length && is<s.length) {
            if(g[ig]<s[is]) {
                ig++;
                is++;
                count++;
            } else if(s[is]<g[ig]) {
                is++;
            } else {
                count++;
                ig++;
                is++;
            }
        }
        return count;
    }
}