public class PalindromeBySB {
    public static void main(String[] args) {
        String ex = "abcdcba";
        System.out.println(checkP(ex));
    }
    static boolean checkP(String ex) {
        StringBuilder checkString = new StringBuilder();
        //adding string to string builder object
        checkString.append(ex,0,ex.length());
        checkString.reverse();
        //converting stringBuilder object to string so to apply .equals method to it
        if (checkString.toString().equals(ex)) {
            return true;
        }
        return false;
    }
}
