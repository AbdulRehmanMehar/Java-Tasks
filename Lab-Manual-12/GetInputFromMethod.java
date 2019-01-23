import java.util.Scanner;

public class GetInputFromMethod{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    getInput(sc);
  }
  public static void getInput(Scanner sc){
    System.out.print("What's your age: ");
    int age = sc.nextInt();
    System.out.print("What's your name: ");
    sc.nextLine(); // to dump line break
    String name = sc.nextLine();
    printInput(name, age);
  }
  public static void printInput(String name, int age){
    System.out.print("Your name is: " + name + " & age is: "+ age);
  }
}
