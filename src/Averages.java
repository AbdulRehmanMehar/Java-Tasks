import java.util.Scanner;

public class Averages{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter integers to get their sum and average");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int sumIntegers = num1 + num2 + num3 + num4 + num5;
        int averageInt = sumIntegers / 5;
        System.out.println("Sum of "+ num1 + " + " + num2 + " + " + num3 + " + " + num4 + " + " + num5 + " is " + sumIntegers + " and average is "+ averageInt);
        System.out.println("Enter some floating values");
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();
        double val3 = sc.nextDouble();
        double val4 = sc.nextDouble();
        double val5 = sc.nextDouble();
        double sumDoubles = val1 + val2 + val3 + val4 + val5;
        double avgDouble = sumDoubles / 5;
        System.out.println("Sum of "+ val1 + " + " + val2 + " + " + val3 + " + " + val4 + " + " + val5 + " is " + sumDoubles + " and average is "+ avgDouble);
        sc.close();
    }
}