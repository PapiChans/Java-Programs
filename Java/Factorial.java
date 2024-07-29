package factorial;

import java.util.Scanner;

public class Factorial {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Find the Factorial of a number");
        System.out.println("--------------------------");
        System.out.println(" ");
        
        int num,cnt,fct = 1;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("The formula to find the factorial is: ");
        System.out.println("Factorial * Count");
        System.out.println("--------------------------");
        
        for (cnt = 1; cnt <= num; cnt++){
            fct = fct * cnt;
        }
        
        System.out.println(" ");
        System.out.println("The factorial of "+num+" is "+fct);
    }
}