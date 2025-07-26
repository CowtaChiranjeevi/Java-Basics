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
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            
    
        }


    }
}
