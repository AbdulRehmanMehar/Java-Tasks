import java.util.Scanner;

public class GetUrlEncoded{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Format: name=Abdul Rehman, age=18, ....");
		System.out.print("Enter your details: ");
		String str = sc.nextLine();
		splitString(str);
	}
	public static void splitString(String str) {
		String [] base = str.split(",");
		String [] child;
		for(String value : base){
			child = value.split("=");
			System.out.println("Your "+ child[0].replace(" ", "") +" is "+ child[1]);
		}
	}
}
