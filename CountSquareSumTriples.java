class CountSquareSumTriples {
    public static void main(String[] args) {
        System.out.println(countTriples(5)); // ans = 2
        System.out.println(countTriples(10));// ans = 4
    }
    static int countTriples(int n) {
        int countOfTriplet =0;
        for(int i=1;i<=n;i++) {
            for(int j=i+1;j<=n;j++) {
                for(int k =j+1;k<=n;k++) {
                    if((i*i)+(j*j)==(k*k)) {
                        countOfTriplet+=2;
                    }
                    if((j*j)+(k*k)==(i*i)){
                        countOfTriplet+=2;
                    }
                    if((i*i)+(k*k)==(j*j)) {
                        countOfTriplet+=2;
                    }
                }
            }
        }
        return countOfTriplet;
    }
}