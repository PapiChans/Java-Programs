package MiddleNumber;

import java.util.Scanner;


public class MiddleNumber {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
    int fnum,snum,mnum;
    
    System.out.println("--------------------------");
    System.out.println("Middle between two numbers");
    System.out.println("--------------------------");
    
    System.out.println("Enter first number: ");
    fnum = sc.nextInt();
    
    System.out.println("Enter second number: ");
    snum = sc.nextInt();
    
    mnum = (fnum / 2) + (snum / 2);
    
    System.out.println("The number between "+fnum+" and "+snum+" is "+mnum);
    
        
    }
    
}
