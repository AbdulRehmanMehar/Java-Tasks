import java.util.Scanner;

public class PerfectMethod{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    isPerfect(N);
  }
  public static void isPerfect(int number){
    int sum = 0;
    for(int i = 1; i < number; i++){
      if(number % i == 0){
        printPerfect(i);
        sum += i;
      }
    }
    if(sum == number){
      System.out.println("Entered Number " + number + " is perfect.");
    }else{
      System.out.println("Entered Number " + number + " is not perfect.");
    }
  }
  public static void printPerfect(int number){
    int sum = 0;
    for(int i = 1; i < number; i++){
      if(number % i == 0){
        sum += i;
      }
    }
    if(sum == number){
      System.out.println("Number " + number + " is perfect.");
    }
  }
}
