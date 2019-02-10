import java.util.Scanner;

public class ArrayPalinDromes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int len = sc.nextInt();
		int arr [] = new int[len];
		System.out.println("Enter " + len + " values seperated by line-break.");
		for(int i=0; i<len; i++){
			arr[i] = sc.nextInt();
		}
		int arr2 [] = new int[len];
		for(int i=len-1; i >= 0; i--){
			arr2[len - i - 1] = arr[i];
		}
		if(isPalinDromes(arr, arr2)){
			System.out.print("Array is Palin Dromes");
		}else{
			System.out.print("Array is not Palin Dromes");
		}
	}
	public static boolean isPalinDromes(int arr [], int arr2 []){
		boolean isPalinDromes = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] != arr2[i]) isPalinDromes = false;
		}
		return isPalinDromes;
	}

}
