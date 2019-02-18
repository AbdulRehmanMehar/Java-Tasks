import java.util.Scanner;

public class TwoDimensionalArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();	
		int [][] arr = new int [size][size];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		print(arr);
		System.out.println("Diagonal Sum " + diagonalSum(arr));
		System.out.println("Diagonal Reverse Sum " + diagonalRevSum(arr));
		System.out.println("TRANSPOSE");
		print(transpose(arr));
	}
	public static int diagonalSum(int [][] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i][i];
		}
		return sum;
	}	
	public static int diagonalRevSum(int [][] arr){
		int sum = 0;
		for(int i=arr.length-1; i >= 0; i--){
			sum += arr[i][arr.length -1 - i];
		}
		return sum;
	}	
	public static int [][] transpose(int [][] arr){
		int swap;
		for(int i=0; i<arr.length; i++){
			for(int j=0; i<arr[0].length; i++){
				swap = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = swap;
			}
		}
		return arr;
	}
	public static void print(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
