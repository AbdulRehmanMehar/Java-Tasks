import java.util.Scanner;

public class QuartersDollars{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of quarter: ");
    double quarter = sc.nextDouble();
    double dollar  = convert(quarter);
    System.out.print(dollar);
  }
  public static double convert(double a){
    return a / 4;
  }
}
