import java.util.Scanner;

public class  Loops4Lab11{
  public static void main(String [] args){
    int vowels = 0;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();
    for(int i = 0; i <= str.length() - 1; i++){
      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        vowels++;
      }
    }
    System.out.println("Number of vowels " + vowels);
  }
}
