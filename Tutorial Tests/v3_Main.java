import java.util.*;

public class v3_Main {
    public static void main(String[] args) {
        
        Scanner chk = new Scanner(System.in);

        // System.out.println("Enter the value of A :");
        // int a = chk.nextInt();
        // System.out.println("Enter the value of B :");
        // int b = chk.nextInt();
        // if (a == b) {
        //     System.out.println("Both A and B are equal.");            
        // }      
        // else if (a > b) {
        //     System.out.println("A is greater than B.");           
        // }
        // else {
        //     System.out.println("B is greater than A.");
        // 

        System.out.println("Enter the value of the button you would like to print.");
        int button = chk.nextInt(); 
        
        switch(button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }



        }
}
