import java.util.Scanner;

public class PermiterAndArea{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter width and length spereated by line break.");
    int l = sc.nextInt(),
        w = sc.nextInt();
    if(l > 0 && w > 0){
      calculate(l, w);
    }else{
      System.out.print("Entered values were Invalid.");
    }
  }
  public static void calculate(double l, double w){
    double perimeter = 2 * (l + w),
           area = l * w;
    System.out.print("Perimeter is: " + perimeter + " & Area is: "+ area);
  }
}
