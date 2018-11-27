import java.util.Scanner;

public class Assignment1 {
    public static void main(String [] args){

        final int week_in_month = 4;
        final int fixed_hours = 40;
        final int commission = 250;
        final double weekly_gross = 5.7;

        int jobCode;
        double salary = 0.0,
                overTime = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your Job Code :");
        System.out.println("\t  For Manger Enter 1");
        System.out.println("\t  For Hourly Workers Enter 2");
        System.out.println("\t  For Commission Workers Enter 3");
        System.out.println("\t  For Piece Workers Enter 4");


        jobCode = sc.nextInt();
        if(jobCode == 1){ // Its a Manager
            System.out.println("Hello Manager, Please Enter your weekly salary.");
            salary = week_in_month * sc.nextDouble();
        }else if(jobCode == 2){ // Its Hourly Worker
            System.out.println("Greetings Hourly Worker, Please Enter your Hourly Rate.");
            salary = fixed_hours * sc.nextDouble();
            System.out.println("Did you worked overtime? If so Enter number of hours.Else Enter 0.");
            overTime = sc.nextDouble();
            if(overTime != 0.0){
                salary /= fixed_hours; // Divided by Fixed hours to revert Calculation
                salary *= ( fixed_hours + overTime ); // Multiply actual hourly rate with fixed_hours + overTime
            }
        }else if(jobCode ==3) { // Commission Worker
            System.out.println("Good Day Commission Worker, Enter Weekly Sales");
            salary = commission + ( sc.nextDouble() * weekly_gross / 100 );
        }else { // Piece Worker
            System.out.println("Hola Piece Worker, Enter price of one Item.");
            salary = sc.nextDouble();
            System.out.println("Enter Quantity you produced.");
            salary *= sc.nextInt();
        }
        System.out.println("Your Monthly Salary is: "+ salary);
    }
}
