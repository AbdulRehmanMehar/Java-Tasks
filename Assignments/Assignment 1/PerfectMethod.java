import java.util.Scanner;

public class PerfectMethod{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(isPerfect(N)){
      System.out.print("Number " + N + " is Perfect");
    }else{
      System.out.print("Number " + N + " is not Perfect");
    }
  }
  public static boolean isPerfect(int number){
    int sum = 0;
    for(int i = 1; i < number; i++){
      if(number % i == 0){
        sum += i;
      }
    }
    if(sum == number) return true;
    return false;
  }
}
