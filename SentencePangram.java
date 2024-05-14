class SentencePangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("abcdef"));
    }
    //solution
    static boolean checkIfPangram(String sentence) {
        //--------------solution using for loop------------------
        for(char i='a';i<='z';i++) {
            if(sentence.indexOf(i)<0) {
                return false;
            }
        }
        return true;
        

        //-------------------- this below method will work if only the sentence will conatin exact all alphabets-------------
        // sum of all ascii number's in alphabet
        // int sum = 2847;
        // for(int i=0;i<sentence.length();i++) {
        //     sum = sum -(sentence.charAt(i));
        // }
        // return sum<0;

        //--------------------solution using hashset-------------------

        // Set<Character> ans = new HashSet<Character>();
        // for(int i=0;i<sentence.length();i++) {
        //     ans.add(sentence.charAt(i));
        // }
        // return ans.size()==26;

        
    }
}