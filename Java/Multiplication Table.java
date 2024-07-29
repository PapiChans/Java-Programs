package Mtable;

import java.util.Scanner;

public class MTable {
    
    public static void main (String[] args){
        
      Scanner sc = new Scanner (System.in);
      int mcd,mtr,i,pdt;
        
      System.out.println("--------------------------");
      System.out.println("Multiplication Table");
      System.out.println("--------------------------");
      
      System.out.println("Enter a Multiplicand: ");
      mcd = sc.nextInt();
      
      System.out.println("Enter the range of a Multiplier: ");
      mtr = sc.nextInt();
      
      System.out.println("Here's the result");
      for (i = 1; i <= mtr ; i++){
          pdt = mcd * i;
          System.out.println(mcd +" * "+ i + " = "+ pdt);
      }
    }
}