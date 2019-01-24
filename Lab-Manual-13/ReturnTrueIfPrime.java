import java.util.Scanner;

public class ReturnTrueIfPrime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(isPrime(x)){
			System.out.print(x + " is prime number");
		}else{
			System.out.print(x + " is not a prime number.");
		}
	}
	public static boolean isPrime(int x){
		boolean isPrime = true;
		if(x <= 1) return false;
		for(int i=2; i < x; i++){
			if(x % i == 0){
				isPrime = false;
			}
		}
		return isPrime;
	}
}
