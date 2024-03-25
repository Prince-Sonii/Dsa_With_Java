public class Pattern {
    public static void main(String[] args) {
        patternTriangle(5);
        leftTipMountain(9);
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

        for (int row =1;row<=n;row++) {
            int half = n/2;
            if(row<=half+1) {
                for (int col1=1;col1<=row;col1++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else {
                for (int col2 =1;col2<=n+1-row;col2++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void leftTipMountain(int n) {
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


}
