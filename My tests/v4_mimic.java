import java.util.*;
public class v4_mimic {
    public static void main(String[] args) {
        //Give a multiplication table answer for the user entered number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you would like a multiplication table for:");
        int n = sc.nextInt();
        int mul = 0;

        // System.out.println("Hereunder is the multiplication table:");
        for(int co = 1; co < 11; co++) {
        System.out.println(n * co);
        }

        //Homework problem from video 4  (Print all even numbers till n)
        System.out.println("Enter a random number and the output will be all the even numbers up to that point:");
        int g = sc.nextInt();

        for(int h = 1; h <= g; h++) {
            if (h % 2 == 0) {
                System.out.println(h);
            }
        }

        //Bonus homework problem from video 4 (Print if a number is prime or not)
        System.out.println("Enter a random number to check if it is prime number or not");
        int prime = sc.nextInt();
        int count = 0;
        if(prime == 1) {
            System.out.println("This is neither prime nor composite"); }
        else {

        for(int g7 = 1; g7 <= prime; g7++) {
            if (prime % g7 == 0) count+=1; 
        }
    }
        if (count == 2) System.out.println("This is a prime number");
        else if (count > 2) System.out.println("This is a composite number");
           
        
        
    }
}

