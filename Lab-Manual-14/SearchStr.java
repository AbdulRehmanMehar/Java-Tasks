import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SearchStr{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("Enter another string: ");
    String str1 = sc.nextLine();
    System.out.print("Found at "+ searchString(str, str1));
  }
  public static int searchString(String source, String target){
    int s = -1;
    Pattern word = Pattern.compile(target);
    Matcher match = word.matcher(source);
    while(match.find()){
      s = match.start();
    }
    return s;
  }
}
