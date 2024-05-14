import java.util.List;

class CountMatchingItems {
    public static void main(String[] args) {
        // I am just putting only solution not test cases
        // because the test cases are too long, somewhere it will make readability difficult
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++) {
            if(ruleKey.equals("type")) {
                if(items.get(i).get(0).equals(ruleValue)) {
                    count++;
                }
            }
            else if(ruleKey.equals("color")) {
                if(items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }
            } else {
                if(items.get(i).get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}