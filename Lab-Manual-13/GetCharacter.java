import java.util.Scanner;

public class GetCharacter{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int y = sc.nextInt();
		System.out.print(getChar(x, y));
	}
	public static char getChar(String word, int index){
		if(index <= word.length()) return word.charAt(index - 1);	// As humans start counting from 1
		return '~';
	}
}
