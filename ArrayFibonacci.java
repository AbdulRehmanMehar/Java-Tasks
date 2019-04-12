import java.util.Scanner;

public class ArrayFibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int [] arr = new int [sc.nextInt()];
		System.out.println("Enter array values");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		if(isFibonacci(arr)){
			System.out.print("Array is fibonacci");
		}else{
			System.out.print("Array is not fibonacci");
		}
	}
	public static boolean isFibonacci(int [] arr) {
		boolean is = true;
		int prev = 0;
		for(int i=1; i<arr.length - 1; i++) {
			prev = arr[i - 1];
			if((prev + arr[i]) != arr[i + 1]) return false;
		}
		return true;
	}
}
