public class Pattern {
    public static void main(String[] args) {
        rhombus(4);
    }
    static void patternTriangle(int n) {
       /*

        *
        * *
        * * *
        * * * *

        */

        for(int row=1;row<=n;row++) {
            for (int col =1;col<=row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternRectangle(int n) {
        /*

         ****
         ****
         ****
         ****

         */
        for(int row=1;row<=n;row++) {
            for (int col =n;col>0;col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void reverseTriangle(int n) {
        /*

         * * * *
         * * *
         * *
         *

         */
        for(int row=1;row<=n;row++) {
            for (int col =1;col<=n-row+1;col++) {
                System.out.print("* ");
            }
            System.out.println();
    }
}
    static void sidewaysMountain(int n) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */

        for (int row =1;row<2*n;row++) {
            int half = row<=n?row:2*n-row;
            for (int col=1;col<=half;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
//            if(row<=half+1) {
//                for (int col1=1;col1<=row;col1++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }else {
//                for (int col2 =1;col2<=n+1-row;col2++) {
//                    System.out.print("* ");
//                }}

    static void leftTipSidewaysMountain(int n) {
        /*

             *
            **
           ***
          ****
         *****
          ****
           ***
            **
             *

         */
        for (int row =1;row<=n;row++) {
            int half = (n/2)+1;
            if (row<=half) {
                for (int colup=1;colup<=half;colup++) {
                    if (colup>half-row) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
            else {
                for (int coldn=1;coldn<=half;coldn++) {
                    if (coldn>row-half) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    static void leftSideTriangle(int n) {
        for(int row =1;row<=n;row++) {
            for (int col =1;col<=n;col++) {
                if(col>n-row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    static void rhombus(int n) {
        for (int row =1;row<2*n;row++) {
            for (int col=1;col<=n;col++) {
                if (n>=row&&col>n-row || row>n&&col>row-n){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
    }



}}
