import java.util.Scanner;

public class TourPlanner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intro(sc);
		budget(sc);
		time(sc);
	}
	public static void intro(Scanner sc){
		System.out.println("Welcome to Tour Planner");
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		while(!isNameValid(name)){
			System.out.print("Please Enter a valid name: ");
			name = sc.nextLine();
		}
		System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
		String destination = sc.nextLine();
		System.out.println("Great! " + destination + " sounds like a great trip.");
		System.out.println("***************************************");
	}
	public static void budget(Scanner sc){
		System.out.print("How many days are you going to spend on travelling? ");
		int days = sc.nextInt();
		while(!isDayValid(days)){
			System.out.print("Please Enter a valid value for days (greater than 0): ");
			days = sc.nextInt();
		}
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		double budget = sc.nextDouble();
		while(!isBudgetValid(budget)){
			System.out.print("Please Enter a valid value for budget (greater than 99): ");
			budget = sc.nextDouble();
		}
		System.out.print("What is the three lettered currency symbol for your travel destination? ");
		sc.nextLine(); // In order to dump the line break.
		String currency = sc.nextLine();
		while(currency.length() != 3){
			System.out.print("Please enter valid currency symbol for your travel destination (3 lettered): ");
			currency = sc.nextLine();
		}
		System.out.print("How many "+ currency.toUpperCase() +" are there in 1 USD? ");
		double unitCurrency = sc.nextDouble();
		while(!isConversionValid(unitCurrency)){
			System.out.print("Please enter valid number for "+ currency.toUpperCase() +" in USD: ");
			unitCurrency = sc.nextDouble();
		}
		double budInGivenCurrency = unitCurrency * budget;

		System.out.println("If you are travelling for "+days+" days that is the same as "+(days * 24)+" hours or "+(days * 24 * 60)+" minutes");
		System.out.println("If you are going to spend $ "+((int) budget)+" USD that means per day you can spend up to $ "+((int) (budget/days))+" USD per day");
		System.out.println("Your total budget in PKR is "+((int) budInGivenCurrency)+" PKR, which per day is "+((int) (budInGivenCurrency/days))+" PKR");
		System.out.println("***************************************");
	}
	public static void time(Scanner sc){
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		int timeDif = sc.nextInt();
		System.out.print("That means when it is midnight(00:00) at home, then it will be "+((24+timeDif) % 24)+":00 in your travel destination and when it is noon(12:00) at home it will be "+ ((timeDif + 12) % 24) + ":00");
	}
	public static boolean isNameValid(String name){
		boolean isValid = true;
		String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,'`~-=+;:";
		for(int i=0; i<name.length(); i++){
			if(Character.isDigit(name.charAt(i)) || specialChars.contains(name.substring(i, i+1))){
				isValid = false;
			}
		}
		return isValid;
	}
	public static boolean isDayValid(int a){
		if(a <= 0) return false;
		return true;
	}
	public static boolean isBudgetValid(double a){
		if(a <= 99) return false;
		return true;
	}
	public static boolean isConversionValid(double a){
		if(a <= 0) return false;
		return true;
	}
}
