import java.lang.Math;
import java.util.Scanner;

public class  NumberTypeLab5{
    public static void main(String [] args){
        double input, epsilon = 1e-12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        input = sc.nextDouble();
        if(Math.abs(Math.floor(input) - input) > epsilon){ // Real Number
            System.out.println("Real number");
        }else{
            System.out.println("Integer Value");
        }
        sc.close();
    }
}