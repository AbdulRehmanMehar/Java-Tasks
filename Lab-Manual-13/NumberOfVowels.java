import java.util.Scanner;

public class NumberOfVowels{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.print("Number of vowels in \"" + x + "\" is " + numberOfVowels(x));	
	}
	public static int numberOfVowels(String word){
		char c;
		int vowels = 0;
		word.toLowerCase();
		for(int i = 0; i <= word.length() - 1; i++){
			c = word.charAt(i);			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				vowels++;
			}
		}
		return vowels;
	}
}
