import java.util.Scanner;

public class Usd2PkrCurrency{
	public static void main(String [] args){
		final int unitUsd2Pkr = 140;
		Scanner sc = new Scanner(System.in);
		int usd = sc.nextInt();
		int pkr = unitUsd2Pkr * usd; // Currency in PKR
		System.out.println(usd + " USD is equal to " + pkr + " Pkr");
		Exchange(pkr);
	}
	public static void Exchange(int N){
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9=0, count10=0;
		System.out.println("Exchange of Currency..........");
		if(N >= 5000){
			while(N >= 5000){
				count1++;
				N -= 5000;
			}
			System.out.println(count1 + " " + 5000);
		}
		if(N >= 1000){
			while(N >= 1000){
				count2++;
				N -= 1000;
			}
			System.out.println(count2 + " " + 1000);
		}
		if(N >= 500){
			while(N >= 500){
				count3++;
				N -= 500;
			}
			System.out.println(count3 + " " + 500);
		}
		if(N >= 100){
			while(N >= 100){
				count4++;
				N -= 100;
			}
			System.out.println(count4 + " " + 100);
		}
		if(N >= 50){
			while(N >= 50){
				count5++;
				N -= 50;
			}
			System.out.println(count5 + " " + 50);
		}
		if(N >= 20){
			while(N >= 20){
				count6++;
				N -= 20;
			}
			System.out.println(count6 + " " + 20);
		}
		if(N >= 10){
			while(N >= 10){
				count7++;
				N -= 10;
			}
			System.out.println(count7 + " " + 10);
		}
		if(N >= 5){
			while(N >= 5){
				count8++;
				N -= 5;
			}
			System.out.println(count8 + " " + 5);
		}
		if(N >= 2){
			while(N >= 2){
				count9++;
				N -= 2;
			}
			System.out.println(count9 + " " + 2);
		}
		if(N >= 1){
			while(N >= 1){
				count10++;
				N -= 1;
			}
			System.out.println(count10 + " " + 1);
		}
	}
}
