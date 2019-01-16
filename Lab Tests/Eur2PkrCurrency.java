import java.util.Scanner;

public class Eur2PkrCurrency{
	public static void main(String [] args){
		final int unitEur2Pkr = 140;
		Scanner sc = new Scanner(System.in);
		int eur = sc.nextInt();
		int pkr = unitEur2Pkr * eur;
		System.out.println(eur + " is equal to " + pkr);
		Exchange(pkr);
	}
	public static void Exchange(int amount){
		System.out.println("Exchange of Currency..........");
		if(amount >= 5000){
			System.out.println("5000 X " + (amount / 5000));
			amount %= 5000;
		}
		if(amount >= 1000){
			System.out.println("1000 X " + (amount / 1000));
			amount %= 1000;
		}
		if(amount >= 500){
			System.out.println("500 X " + (amount / 500));
			amount %= 500;
		}
		if(amount >= 100){
			System.out.println("100 X " + (amount / 100));
			amount %= 100;
		}
		if(amount >= 50){
			System.out.println("50 X " + (amount / 50));
			amount %= 50;
		}
		if(amount >= 20){
			System.out.println("20 X " + (amount / 20));
			amount %= 20;
		}
		if(amount >= 10){
			System.out.println("10 X " + (amount / 10));
			amount %= 10;
		}
		if(amount >= 5){
			System.out.println("5 X " + (amount / 5));
			amount %= 5;
		}
		if(amount >= 2){
			System.out.println("2 X " + (amount / 2));
			amount %= 2;
		}
		if(amount >= 1){
			System.out.println("1 X " + (amount / 1));
			amount %= 1;
		}
	}
}
