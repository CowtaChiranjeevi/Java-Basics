import java.util.*;
public class v3_mimic {
    public static void main(String[] args) {
        
       //Homework problem from video 3 (1. Make a calculator) 
       System.out.println("Welcome to a Java made calculator !");
        Scanner canon = new Scanner(System.in);
        System.out.println("Enter a random number of your choice");
        int a = canon.nextInt();
        System.out.println("Enter another random number of your choice");
        int b = canon.nextInt();
        
        System.out.println("Enter the symbol of the mathematic calculation you would like the machine to perform on both the numbers [Ex : + , - , * , / , % ] ");
        String c = canon.next();
        System.out.println("Your answer is :");
        switch (c) {
            case "+": System.out.println(a + b);
            break;
            case "-": System.out.println(a - b);
            break;
            case "*": System.out.println(a * b);
            break;
            case "/": if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Cannot divide with 0");
            } 
            break;
            case "%": if (b != 0) {
                System.out.println(a % b);
            } else {
                System.out.println("Cannot perform modulas with 0");
            }
            break;
            default: System.out.println("Error: Incorrect value inputted.");
                break;
        }
        
        //Homework problem #2 from video 3. (A conditional statment where entering the number of a month in its chronological order would prompt the name of the month)
        System.out.println("Enter a number from 1-12");
        int m = canon.nextInt();
        System.out.println("This is the month the number corresponds to: ");
        switch (m) {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
            default: System.out.println("Invalid number entered.");
                break;
        }
        

    }
    
}
