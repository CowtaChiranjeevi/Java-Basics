import java.util.*;
public class v1_Unmain{
    public static void main(String[] args) {
       //output
        System.out.println("THis is me playing around with java boooiiss.");
        System.out.println("I am gonna become what's called a pokemon master!@#$%^&*/?,.<>[{");
        System.out.println("GOTTA CATCHEMMAllLllAALLlllll...");
    
        int a = 10;
        int b = 25;
        int sum = a + b;

        System.out.println("The sum of two variables where a = 10 , b = 25.");
        System.out.println(sum);

        int diff = b - a;
        int mul = a * b;
        System.out.println("The difference between the same numbers.");
        System.out.println(diff);
        System.out.println("The multiplied value of the same numbers.");
        System.out.println(mul);

        //In order to place comments in Java like so , start the code with two forward slashes "//" ;)

        a = 7;
        b = 9;
        
        int brbpr = (a * b) / (a - b);
        System.out.println(brbpr);
        System.out.println("The above number is a division of two different values of the same variable a and b.");
        
        
        sum = a + b;
        System.out.println("Below number is a simple addition.");
        System.out.println(sum);

        //Experimenting with a weird scanner object name :)
        // 
        //  
        // 
         
       
        Scanner yeuh = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int a1 = yeuh.nextInt();
       
        System.out.println("Enter your Mother's Age");
        int b1 = yeuh.nextInt();
        
        int minus = b1 - a1;
        System.out.println("This is the age difference between you both ! :)");
        System.out.println(minus);


    
    
    }
}