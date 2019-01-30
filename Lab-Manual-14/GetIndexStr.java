import java.util.Scanner;

public class GetIndexStr{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("Enter another string: ");
    String str1 = sc.nextLine();
    System.out.print("Found at "+ searchString(str, str1));
  }
  public static int searchString(String source, String target){
    return source.indexOf(target);
  }
}
