import java.util.Scanner;

public class CountMyWords{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print(countNumberOfWords(str));
  }
  public static int countNumberOfWords(String str){
    int a = 0;
    String x[] = str.split(" ");
    while(a < x.length){
      a++;
    }
    return a;
  }
}
