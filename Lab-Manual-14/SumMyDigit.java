import java.util.Scanner;

public class SumMyDigit{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.print(sumStringDigits(str));
  }
  public static int sumStringDigits(String str){
    char c;
    int sum = 0;
    for(int i=0; i<str.length(); i++){
      c = str.charAt(i);
      if(Character.isDigit(c)){
        sum +=  Character.getNumericValue(c);
      }
    }
    return sum;
  }
}
