package leapyear;

import java.util.Scanner;

public class LeapYear {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int year;
        
        System.out.println("-------------------------------------");
        System.out.println("Leap Year");
        System.out.println("-------------------------------------");
        System.out.println("Enter the Year: ");
        year = sc.nextInt();
        
        if (((year % 4 == 0) && (year % 100!= 0)) || (year% 400 == 0)){
            System.out.println("-------------------------------------");
            System.out.println("The year "+ year + " is a leap year");
            System.out.println("-------------------------------------");
        }
        else{
            System.out.println("-------------------------------------");
            System.out.println("The year "+ year + " is not a leap year");
            System.out.println("-------------------------------------");
        }
        
    }
}