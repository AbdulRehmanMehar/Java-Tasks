import java.util.Scanner;

public class ConvertNumtoArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int num1 = num;
		int count = 0;
		while(num != 0){
			count++;
			num /= 10;
		}
		int arr [] = new int[count];
		splitDigits(num1, arr, arr.length);
	}
	public static void splitDigits(int num, int arr [], int size){
		String theNum = String.valueOf(num);
		for(int i=0; i<size; i++){
			arr[i] = Character.getNumericValue(theNum.charAt(i));
		}
		printArray(arr, size);
	}
	public static void printArray(int arr [], int size){
		System.out.print("[");
		for(int i=0; i<size; i++){
			if(i == size - 1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i] + ",");
			}
		}	
		System.out.print("]");
	}
}
