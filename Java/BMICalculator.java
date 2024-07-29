package bmicalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float h2,hht,bmi;
        
        System.out.println("-------------------------------------");
        System.out.println("BMI (Body Mass Index) Calculator");
        System.out.println("-------------------------------------");
        System.out.println("Enter your Height in Centimeters (cm): ");
        float h1 = sc.nextFloat();
        System.out.println("Enter your Weight in Kilograms (kg): ");
        float wht = sc.nextFloat();
        System.out.println(" ");
        
        h2 = h1 / 100; // Divide the centimeters by 100
        hht = h2 * h2; // After divide, Multiply it by itself
        bmi = wht / hht; // Calculate BMI
        
        System.out.println("-------------------------------------");
        System.out.println("Computation of your BMI");
        System.out.println("-------------------------------------");
        System.out.println("Your Height is: " + h1 + " cm");
        System.out.println("Your Weight is: " + wht + " kg");
        System.out.println(" ");

        System.out.println("-------------------------------------");
        System.out.println("To Calculate BMI");
        System.out.println("Height: "+ h1 + " cm / 100 is " + h2);
        System.out.println("Square of Height: "+ h2 +" * "+ h2 +" is " + hht);
        System.out.println("Your BMI is Weight divided by Height: "+wht+" / "+hht);
        System.out.println("BMI: "+bmi);
        
        if (bmi <= 18.5){ // If-Else for Weight Classification
            System.out.println("Weight Status: Underweight");
        }
        else if (bmi <= 24.9){
            System.out.println("Weight Status: Healthy");
        }
        else if (bmi <= 29.9){
            System.out.println("Weight Status: Overweight");
        }
        else if (bmi <= 34.9){
            System.out.println("Weight Status: Obesity Class 1");
        }
        else if (bmi <= 39.9){
            System.out.println("Weight Status: Obesity Class 2");
        }
        else if (bmi >= 40.0){
            System.out.println("Weight Status: Obesity Class 31");
        }
    }
    
}
