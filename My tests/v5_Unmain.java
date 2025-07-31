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
        
    }
}
