import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print(countNumberOfVowels(str));
  }
  public static int countNumberOfVowels(String str){
    char c;
    int count = 0;
    str.toLowerCase();
    for(int i=0; i<str.length(); i++){
      c = str.charAt(i);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
    }
    return count;
  }
}
