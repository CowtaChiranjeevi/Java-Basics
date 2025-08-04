public class v6_Main {
    public static void main(String []args) {

        // Advanced pattern questions

        // Pattern #10 Bowtie 
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
       


    }
}
