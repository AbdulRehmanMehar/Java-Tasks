import java.util.Scanner;

public class TellWordInfo{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String x = sc.nextLine();
    wordInfo(x);
  }
  public static void wordInfo(String word){
    int vowels = 0;
    word.toLowerCase();
    for(int i = 0; i <= word.length() - 1; i++){
      char c = word.charAt(i);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        vowels++;
      }
    }
    System.out.print("Length: " + word.length() + " & vowles: "+ vowels);
  }
}
