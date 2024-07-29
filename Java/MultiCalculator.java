package MultiCalculator;

import java.util.Scanner;

public class MultiCalculator {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------");
        System.out.println("Multi Calculator");
        System.out.println("--------------------------");
        
        int fnum,snum,res;
        
        System.out.println("Enter First number: ");
        fnum = sc.nextInt();
        
        System.out.println("Enter Second number: ");
        snum = sc.nextInt();
        
        System.out.println("Here are the results:");
        res = fnum + snum;
        System.out.println("Addition: "+fnum+" + "+snum+" = "+res);
        res = fnum - snum;
        System.out.println("Subtraction: "+fnum+" - "+snum+" = "+res);
        res = fnum * snum;
        System.out.println("Multiplication: "+fnum+" * "+snum+" = "+res);
        res = fnum / snum;
        System.out.println("Division: "+fnum+" / "+snum+" = "+res);
    }
} 