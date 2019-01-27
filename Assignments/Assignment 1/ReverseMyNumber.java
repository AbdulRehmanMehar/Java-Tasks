import java.lang.Math;
import java.util.Scanner;

public class ReverseMyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print its reverse else enter -999 to exit");
		int N = sc.nextInt();
		while(N != -999){
			reverse(N);
			N = sc.nextInt();
		}
		System.out.print("Thank you for using this program. Good Bye.");
	}
	public static void reverse(int N){
		System.out.print("Reverse is = ");
		if(N < 0) System.out.print("-");
		while(N != 0){
			System.out.print(Math.abs(N%10)); // Math.abs() returns a number without sign (removes - sign)
			N /= 10;
		}
		System.out.println("\nEnter a number to print its reverse else enter -999 to exit");
	}
}
