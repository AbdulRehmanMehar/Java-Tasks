import java.util.Scanner;

public class ValidatePassword{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    validatePassword(str);
  }
  public static void validatePassword(String password){
    char c;
    int digits = 0;
    int upLetter = 0;
    int lwrLetter = 0;
    int length = password.length();
    for(int i=0; i<length; i++){
      c = password.charAt(i);
      if(Character.isDigit(c)) digits++;
      if(Character.isUpperCase(c)) upLetter++;
      if(Character.isLowerCase(c)) lwrLetter++;
    }
    System.out.println("Your Password Contains: ");
    System.out.println(digits + " Digits");
    System.out.println(upLetter + " UpperCase letters");
    System.out.println(lwrLetter + " LowerCase letters");
    System.out.println("Length of password is " + length);
    if(digits > 0 && upLetter > 0 && lwrLetter > 0 && length >= 6){
      System.out.print("Password Accepted!");
    }else{
      System.out.print("Password is Invalid!");
    }
  }
}
