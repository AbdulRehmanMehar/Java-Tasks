import java.util.Scanner;

public class ReturnArea{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(),
		    y = sc.nextInt();
		if(x > 0 && y > 0){
			System.out.print("Area is " + calculateArea(x, y));
		}else{
			System.out.print("0 is not allowed in any value.");
		}
	}
	public static double calculateArea(double x, double y){
		return x * y;
	}
}
