import java.util.Scanner;

public class BinaryDigitsLab11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String str = "";
    while(number > 0){
      str = number % 2 + str; // We've to append to right side
      number /= 2;
    }
    if(str.equals("")){
      str = "0";
    }
    System.out.println(str);
  }
}
