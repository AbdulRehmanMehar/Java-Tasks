import java.util.Scanner;
	
public class ReplaceMyNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		System.out.print("Enter position number (starts from 0): ");
		int position = sc.nextInt();
		System.out.print("Enter number to replace: ");
		int replace = sc.nextInt();
		if(isPositionValid(number, position)){
			int num = replaceNumber(number, position, replace);
			System.out.print("New number: " + num);
		}else{
			System.out.print("Invalid Position.");
		}
	}
	public static boolean isPositionValid(int number, int position){
		int count = 0;
		while(number != 0){
			count++;
			number /= 10;		
		}	
		if(position <= count){
			return true;
		}
		return false;
	}
	public static int replaceNumber(int number, int pos, int replace){
		int newNum = 0;
		String num = Integer.toString(number);
		for(int i=0; i<num.length(); i++){
			newNum *= 10;
			if(i == pos){
				newNum += replace;			
			}else{
				newNum += Character.getNumericValue(num.charAt(i));
			}
		}
		return newNum;
	}
}
