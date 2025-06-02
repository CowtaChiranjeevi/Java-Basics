import java.util.*;
public class v3_Unmain {
    public static void main(String[] args) {
        //Conditional Statmenets

        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your age ?");
        int a = sc.nextInt();
        if (a >= 18) { 
            System.out.println("You are an adult.");           
        }
        else {
            System.out.println("You are still not an adult!");
        }       
        System.out.println("Enter a random number :");
        int x = sc.nextInt();
        if ( x % 2 == 0) {
            System.out.println("The number you have entered is an even number.");         
        }   
        else {
            System.out.println("The number you have entered is an odd number.");
    }

        System.out.println("Enter a button value from 1-3.");
        int b = sc.nextInt();

        if (b == 1) {
            System.out.println("HELLO !");
        }
        else if (b == 2) {
            System.out.println("NAMASTE !");
        }
        else if (b == 3) {
            System.out.println("BONJOUR !");
        }
        else {
            System.out.println("Invalid. Try again.");
        }





    }

}
