import java.lang.Math;
import java.util.Scanner;

public class Quadratic{
    public static void main(String [] args){
        double a, b, c, sqrt, proot, nroot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a , then b, then c.");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sqrt = Math.pow(b, 2) - ( 4 * a * c);
        if(sqrt < 0){
            System.out.println("The roots of this equation are imaginary.");
            return;
        }else{
            proot = ( (-1 * b) + Math.sqrt(sqrt) ) / (2 * a);
            nroot = ( (-1 * b) - Math.sqrt(sqrt) ) /  (2 * a);
        }
        System.out.println("Roots of this equation are x="+proot+", x="+ nroot);
        sc.close();
    }
}