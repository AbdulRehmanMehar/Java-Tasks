import java.util.Scanner;

public class InsertionSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int length = sc.nextInt();
        int [] array= new int [length];
        for(int i=0; i<length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array");
        printArray(array);
        array = sortArray(array);
        System.out.println("Sorted Array");
        printArray(array);
    }
     
    public static int [] sortArray(int [] array){
    	int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
            System.out.println("Array at itteration # "+ i);
            printArray(array);
        }
        return array;
    }
    public static void printArray(int [] array){
    	System.out.print("{ ");
        for(int i=0; i<array.length; i++){
        	if(i == array.length - 1){
        		System.out.print(array[i] + " ");
        	}else{
        		System.out.print(array[i] + ", ");
        	}
        }
        System.out.println("}");
    }
}
