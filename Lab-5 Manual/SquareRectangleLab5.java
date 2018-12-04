import java.lang.Math;
import java.util.Scanner;

public class SquareRectangleLab5{
    public static void main(String [] args){
        double height, width, perimeter, area,
            epsilon = 1e-12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter width");
        width = sc.nextDouble();
        System.out.println("Please Enter height");
        height = sc.nextDouble();
        if(Math.abs(height - width) > epsilon){ // rectangle
            perimeter = 2 * (height + width);
            area = height * width;
        }else{
            perimeter = 4 * width;
            area = Math.pow(width, 2);
        }
        System.out.println("Area is "+ area+ " and Perimeter is "+ perimeter);
        sc.close();
    }
}