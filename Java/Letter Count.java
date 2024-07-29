package LetCnt;

import java.util.Scanner;

public class LetCnt {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------------------");
        System.out.println("Letter Counter");
        System.out.println("-------------------------------------");
        System.out.println("Enter a Word: ");
        String c = sc.nextLine();
        
        int cnt = 0;
        for (int i = 0; i < c.length(); i++){
            cnt++;
        }
        
        System.out.println("The letter of a string is: "+ cnt);
    }
}