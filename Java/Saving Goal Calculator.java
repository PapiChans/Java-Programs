package SavingCalculator;

import java.util.Scanner;

public class SavingCalculator {

    public static void main(String[] args) {

        int gol,day,tot;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("--------------------------");
        System.out.println("Saving Goal Calculator");
        System.out.println("--------------------------");
        
        System.out.println(" ");
        System.out.println("Enter you goal amount: ");
        gol = sc.nextInt();
        
        System.out.println(" ");
        System.out.println("Enter how many days to reach your goal: ");
        day = sc.nextInt();
        
        tot = gol / day;
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("You need this amount:");
        System.out.println(tot+"$ in "+day+"days");
        
    }
    
}
