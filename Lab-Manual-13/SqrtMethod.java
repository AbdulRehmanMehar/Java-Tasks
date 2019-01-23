import java.lang.Math;
import java.util.Scanner;

public class SqrtMethod{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double b = sqrt(a);
    System.out.print(b);
  }
  public static double sqrt(int a){
    if(a < 0) return Math.random();
    return Math.sqrt(a);
  }
}
