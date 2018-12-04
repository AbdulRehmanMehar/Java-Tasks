import java.lang.Math;
import java.util.Scanner;

public class BMILab5{
    public static void main(String [] args){
        double BMI, weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Weight in Kg");
        weight = sc.nextDouble();
        System.out.println("Enter your height");
        height = sc.nextDouble() / 3.281; // Convert into m
        BMI = weight / Math.pow(height, 2);
        if(BMI < 18.5){
            System.out.println("You are underweight");
        }else if(BMI > 25){
            System.out.println("You are overweight");
        }else{
            System.out.println("Your weight is Normal");
        }
        sc.close();
    }
}