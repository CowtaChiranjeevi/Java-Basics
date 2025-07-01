import java.util.*;
public class v4_test {
    



   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int input;


    //    do {
    //        int marks = sc.nextInt();
    //        if(marks >= 90 && marks <= 100) {
    //            System.out.println("This is Good");
    //        } else if(marks >= 60 && marks <= 89) {
    //            System.out.println("This is also Good");
    //        } else if(marks >= 0 && marks <= 59) {
    //            System.out.println("This is Good as well");
    //        } else {
    //            System.out.println("Invalid");
    //        }


    //        System.out.println("Want to continue ? (yes(1) or no(0))");
    //        input = sc.nextInt();
      
    //    } while(input == 1);

    int y = 0;  //counter
    int x = sc.nextInt();
    if (x == 1) System.out.println("Neither prime nor composite");
    else if (x <= 0) System.out.println("invalid entry");
    else  {
        for(int co=1; co <= x; co++) { 
            if (x % co == 0)  y = y+1;
        }
    }
    if (y == 2) {
        System.out.println("This is a prime number");
    }
    else if(y != 2) System.out.println("This is a composite number");


   }   
}

    

