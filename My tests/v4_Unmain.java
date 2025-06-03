import java.util.*;
public class v4_Unmain {
    public static void main(String[] args) {
      
      //Prints the sum of all natural from numbers from 0 to n.
      //Placed the line "System.out.println(sum);" inside the for loop brackets to print all the sum following up to n. Place it outside the brackets to just print the final sum.
      Scanner rocky = new Scanner(System.in);
      // System.out.println("Enter any random number:");
      // int i = rocky.nextInt();
      // int sum = 0;
      

      // for(int n = 0; n <= i; n++ ) {
      //   sum = (sum + n);
      //   System.out.println(sum);
      // } 

      // for( ; ; ) System.out.println("Today is tuesday");
      
      // //3rd Homework problem from video 4.
      int x; //marks
      int y; //entry number

      do {
        System.out.println("Enter a number either 1 or 0.");
        y = rocky.nextInt();
        if (y == 1) {
            System.out.println("Enter the marks you got in a subject");
            x = rocky.nextInt();
            if (x >= 90) System.out.println("This is good");
            else if (x >= 60 && x <= 89) System.out.println("This is also good");
            else if (x >= 0 && x <= 59) System.out.println("This is good aswell"); }
        else if (y == 0) {
          System.out.println("Thank you"); 
          break;
        }
        else if (y != 1 || y != 0) System.out.println("Invalid number entered");
           
      } while (y == 1 || y == 0 || y != 0 || y != 1);

      

      
      

    }
    
}
