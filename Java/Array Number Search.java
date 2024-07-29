package ArraySearch;

import java.util.Scanner;

public class ArraySearch {
    
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int sze;
        
      System.out.println("--------------------------");
      System.out.println("Search a number in a array");
      System.out.println("--------------------------");
      
      System.out.println("How many elements in an array?: ");
      sze = sc.nextInt();
      
      int i = 0;
      int[] num = new int[sze];
      
      for (i = 0; i < sze; i++){
          System.out.println("Enter a number in Array "+ i+ " ");
          num[i] = sc.nextInt();
      }
      
      System.out.println("The list of array are: ");
      
      for (i = 0; i < sze; i++){
          System.out.print(num[i] + ",");
      }
      
      int sch,cnt = 0;
      System.out.println(" ");
      System.out.println("Enter the number you want to search?: ");
      sch = sc.nextInt();
      
     for (i = 0; i < sze; i++){
     if (num[i] == sch){
        cnt = 1;
        }
     }
    if (cnt == 1){
        System.out.println("The number "+sch+ " found on the array ");
    }
    else{
        System.out.println("The number "+sch + " is not on the array ");
    }
      
    }
  }