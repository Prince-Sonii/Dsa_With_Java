class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    static int romanToInt(String s) {
        int [] num = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String p =s;
        int ans =0;
        while(!p.isEmpty()){
            for(int i=0;i<num.length;i++) {
                if(p.startsWith(roman[i])) {
                    ans+=num[i];
                    p=p.substring(roman[i].length());
                    break;
                }
            }
        }
        return ans;
    }
}