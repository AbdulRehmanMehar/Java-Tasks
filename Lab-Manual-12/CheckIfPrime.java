import java.util.Scanner;

public class CheckIfPrime{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(isPrime(n));
  }
  public static boolean isPrime(int a){
    boolean isPrime = true;
    if(a <= 2) return false; 
    for(int i = 2; i < a; i++){
      if(a % i == 0){
        isPrime = false;
      }
    }
    return isPrime;
  }
}
