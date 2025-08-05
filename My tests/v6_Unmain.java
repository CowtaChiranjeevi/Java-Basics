public class v6_Unmain {
    public static void main(String []args) {    
        // Homework problems from video 6 Lecture 6 Advanced pattern solving

        // #1 Print a hollow butterfly
        int n1 = 5;
        // Upper part of butterfly
        for(int i=1;i<=n1;i++) {
            // Upper left wing
            for(int j=1;j<=i;j++) {
                if (i == 1 || j == 1 || j == i ) {
                    System.out.print("*");
                }
                else { System.out.print(" ");}  
            }
            // Space
            int spaces = 2 * (n1-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            // Upper right wing
            for(int j=1;j<=i;j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*");
                }
                else { System.out.print(" ");}   
            }
            System.out.println();
        }
        // lower part of butterfly
        for(int i=n1;i>=1;i--) {
            // lower left wing
            for(int j=1;j<=i;j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*");
                }
                else { System.out.print(" ");}  
            }
            // Space
            int spaces = 2 * (n1-i);
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
            // lower right wing
            for(int j=1;j<=i;j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*");
                }
                else { System.out.print(" ");}
            }
            System.out.println();
        }

        System.out.println();
        // #2 Print a hollow rhombus
        int n2 = 5;
        for(int i=1;i<=n2;i++) {
            for(int j=1;j<=n2-i;j++) System.out.print(" ");
            for(int j=1;j<=n2;j++) {
                if (i == 1 || j == 1 || i == n2 || j == n2) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        // #3 Pascal's triangle
        int n3 = 5;
        

        for(int i=1;i<=n3;i++) {
            // Spaces
            for(int j=1;j<=n3-i;j++) { System.out.print(" ");}
            // Main triangle
            int num = 1;
            for(int j=0;j<=i;j++) { 
                System.out.print(num+" ");
                num = num * ( i-j) / (j+1);
            }
            System.out.println();
        }




        System.out.println();
        // #4 print a half pyramid.
        int n4 = 5;
        for(int i=1;i<=n4;i++) {
            // Spaces
            for(int j=1;j<=n4-i;j++) {
                System.out.print(" ");
            }
            // half pyramid
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        // #5 is inverted half pyramid with repeating numbers.
        int n5 = 4;
        int number = 1;
        for(int i = 1; i<=n5+1; i++) {
            System.out.print(number+" ");
        }
        number++;
        System.out.println();
        for(int i=1;i<=n5;i++) {
            for(int j=1;j<=n5-i;j++) {
                System.out.print(number+" ");
            }
            number++;
            System.out.println();
        }





    }
}
