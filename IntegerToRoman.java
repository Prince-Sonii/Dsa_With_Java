class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
    static String intToRoman(int num) {
        String ans ="";
        int[] nums={1000, 900, 500, 400, 100, 90, 50 ,40, 10, 9, 5, 4,1};
        String[] roman ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(num>0) {
            int current=0;
            for(int i=0;i<nums.length;i++) {
                if(num>=nums[i]) {
                    current =i;
                    ans=ans+roman[i];
                    break;
                }
            }
            num-=nums[current];
        }
        return ans;
    }
}