import java.util.Scanner;

public class PrimeNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String numbers;
		
		for(int i=1; i <= N; i++){
			int counter = 0;
			for(int j=i; j >= 1; j--){
				if(i % j == 0){
					counter++;
				}
			}
			if(counter == 2){
				System.out.print(i + " ");
			}	
		}
		
	}
}
