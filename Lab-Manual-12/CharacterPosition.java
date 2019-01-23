import java.util.Scanner;

public class CharacterPosition{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String word = sc.nextLine();
    System.out.print("Enter index: ");
    int index = sc.nextInt();
    charPositions(word, index);
  }
  public static void charPositions(String word, int index){
    if(index > word.length() - 1){
      System.out.print("Invalid index has been provided");
    }else{
      System.out.print(word.charAt(index));
    }
  }
}
