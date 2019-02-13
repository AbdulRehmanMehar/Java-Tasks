import java.util.Scanner;

public class SortMyArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		for(int i=0; i<size; i++){
			System.out.print("Enter value:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted array");
		printArr(arr);
		System.out.println("Sorting.......");
		arr = sortArr(arr);
		System.out.println("Sorted array");
		printArr(arr);
	}
	public static int [] sortArr(int [] arr){
		int temp = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=1; j<arr.length - i; j++){
				if(arr[j] < arr[j-1]){
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				printArr(arr);
			}
		}
		return arr;
	}
	public static void printArr(int [] arr){
		System.out.print("[ ");
		for(int i=0; i<arr.length; i++){
			if(i == arr.length - 1){
				System.out.print(arr[i] + " ");
			}else{
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}
}
