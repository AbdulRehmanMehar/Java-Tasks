import java.util.Scanner;

public class CharacterPosition{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string");
    String str = sc.nextLine();
    System.out.print("The count is "+ countSpaceCharacter(str));
  }
  public static int countSpaceCharacter(String str){ 
   char c;
   int count = 0;
   for(int i=0; i<str.length(); i++){
    c = str.charAt(i);
    if(Character.isWhitespace(c)){
      count++;
    }
   }
   return count;
  }
}
