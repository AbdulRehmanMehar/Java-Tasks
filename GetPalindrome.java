import java.util.Scanner;

public class GetPalindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if(isPlaindrome(str, reverse(str))){
			System.out.print("The entered string is plaindrome.");
		}else{
			System.out.print("The entered string is not plaindrome.");
		}
	}

	public static String reverse(String str) {
		String reverse = "";
		for (int i=str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public static boolean isPlaindrome(String str1, String str2){
		if(str1.equals(str2)) return true;
		return false;
	}
}
