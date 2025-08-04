public class v5_Unmain {
    public static void main(String []args) {
        // Made a alternating binary number triangle with ternary operator
        int rows = 5; // total number of lines

        for (int i = 1; i <= rows; i++) {
            // Start from 1 if the row number is odd, else start from 0
            int start = i % 2 == 0 ? 0 : 1;

            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start; // alternate between 1 and 0
            }
            System.out.println();
        }
        

        System.out.println();
        // Practice 
        int n = 4;
        int m = 5;

        for(int i=1;i<=m;i++) {
            for(int j=1;j<=i;j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1");
                }
                else System.out.print(" 0");
            }
            
            System.out.println();
        }

        System.out.println();
        // Homework problems from video 5 #1 print a solid rhombus
        int n1 = 5;

        for(int i=1;i<=n1;i++) {
            for(int j=1;j<=n1-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // Homework problems from video 5 #2 print a number pyramid
        int n2 = 5;

        for(int i=1;i<=n2;i++) {
            for(int j=1;j<=n2-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        System.out.println();
        // Homework problems from video 5 #2 print a palindromic number pyramid.
         int n3 = 5;

       for(int i=1; i<=n3; i++) {
           //spaces
           for(int j=1; j<=n3-i; j++) {
               System.out.print(" ");
           }

           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }

           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }

       System.out.println();
       int n31 = 5;

       for(int i=1;i<=n31;i++) {
        // 1st part
            for(int j=1;j<=n31-i;j++) {
                System.out.print(" ");
            }
            // 2nd part
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            // 3rd part
            for(int j=2;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
       }


    }
}
