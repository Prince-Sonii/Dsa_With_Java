import java.util.ArrayList;
import java.util.Arrays;

class MatchingRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<>();
        items.add(new ArrayList<>());
        items.get(0).add("phone");
        items.get(0).add("blue");
        items.get(0).add("pixel");
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
       int count = 0;
       int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
       return getcount(items,count,index,0,ruleValue);
    }
    static int getcount(ArrayList<ArrayList<String>> items, int count, int index, int start, String ruleValue){
        if(start == items.size()){
            return count;
        }
        if(items.get(start).get(index).equals(ruleValue)){
            count++;
        }
        return getcount(items,count,index,start+1,ruleValue);
    }
}