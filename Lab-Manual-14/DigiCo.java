import java.util.Scanner;

public class DigiCo{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print("The count is "+ countDigits(str));
  }
  public static int countDigits(String str){
    char c;
   int count = 0;
   for(int i=0; i<str.length(); i++){
    c = str.charAt(i);
    if(Character.isDigit(c)){
      count++;
    }
   }
   return count;
  }
}
