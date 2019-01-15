import java.util.Scanner;

public class Loops3Lab11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String reverse = "";
    int len = name.length() - 1;
    for(int i = 0; i <= len; i++){
      reverse = reverse + name.charAt(len - i);
    }
    System.out.println(reverse);
  }
}
