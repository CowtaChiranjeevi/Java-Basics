public class v6_Main {
    public static void main(String []args) {

        // Advanced pattern questions

        // Pattern #10 Butterfly 
        int n1 = 4;
        // Upper part
        for(int i=1;i<=n1;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n1-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            // lower part
        for(int i=n1;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n1-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
       
        System.out.println();
        // Pattern #11 Solid rhombus
        int n2 = 5;

        for(int i=1;i<=n2;i++) {
            for(int j=1;j<=n2-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern #14 Diamond pattern
        int n3 = 4;
        // Upper part of diamond
        for(int i=1;i<=n3;i++) {
            // Spaces
            for(int j=1;j<=n3-i;j++) {
                System.out.print(" ");
            }
            // Stars
            int stars = (2 * i) - 1;
            for(int j=1;j<=stars;j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part of diamond
        for(int i=n3;i>=1;i--) {
            // Spaces
            for(int j=1;j<=n3-i;j++) {
                System.out.print(" ");
            }
            // Stars
            int stars = (2 * i) - 1;
            for(int j=1;j<=stars;j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
