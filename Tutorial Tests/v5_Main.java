import java.util.*;
public class v5_Main {
    public static void main(String[] args) {

        // Pattern #1 solid rectangle 5 columns, 4 rows.
        // *****
        // *****
        // *****
        // *****

        int n = 4;
        int m = 5;

        for(int i=1;i<=n;i+=1) {
            for(int j=1;j<=m;j++) { 
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #2 hollow rectangle 5 columns 4 rows.
        // *****
        // *   *
        // *   *
        // *****

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #3 Half pyramid.
        // *
        // **
        // ***
        // ****

        int n1 = 4;

        for(int i=1;i<=n1;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #4 Inverted Half pyramid.
        // ****
        // ***
        // **
        // *

        int n2 = 4;

        for(int i=n2 ;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        // Pattern #5 Inverted half pyramid rotated 180 degrees
        //    *
        //   **
        //  ***
        // ****

        int n3 = 4;
        
        for(int i=1;i<=n3;i++) {
            //Space inner loop
            for(int j=1;j<=n3-i;j++){
                System.out.print(" ");
            }
            //Star inner loop
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //Pattern #6 half pyramid with numbers
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4
        // 1 2 3 4 5
        int n6 = 5;
        
        for(int i=1;i<=n6;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #7 Inverted half pyramid with numbers.
        // 1 2 3 4 5
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1
        int n7 = 5;

        for(int i=n7;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n7;i++) {
            for(int j=1;j<=n7-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #8 Floyd's triangle
        // 1
        // 2 3
        // 4 5 6 
        // 7 8 9 10
        // 11 12 13 14 15

        int n8 = 5;
        int number = 1;

        for(int i=1;i<=n8;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #9 0-1 triangle (Binary alternating number triangle)
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        int n9 = 5;

        for(int i=1;i<=n9;i++) {
            for(int j=1;j<=i;j++) {
                int sum = i+j;
                if (sum % 2 == 0 ) System.out.print("1 ");
                else System.out.print("0 ");            
            }
            System.out.println();
        }
        System.out.println();

         


    }
}
