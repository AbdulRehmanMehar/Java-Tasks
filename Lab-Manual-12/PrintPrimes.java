import java.util.Scanner;

public class PrintPrimes{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter range seperated by line-break.");
    int x = sc.nextInt(),
        y = sc.nextInt();
    primesBetween(x, y);
  }
  public static void primesBetween(int a, int b){
    System.out.println("Prime numbers between " + a + " and " + b);
    for(int i = a; i <= b; i++){
      boolean isPrime = true;
      for(int j = 2; j < i; j++){
        if(i % j == 0){
          isPrime = false;
        }
      }
      if(isPrime) System.out.print(i + ", ");
    }
  }
}
