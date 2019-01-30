import java.util.Scanner;

public class RevStr{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print(displayBackwards(str));
  }
  public static String displayBackwards(String str){
    String rev = "";
    for(int i=str.length()-1; i>=0; i--){
      rev += str.charAt(i);
    }
    return rev;
  }
}
