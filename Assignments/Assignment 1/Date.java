import java.util.Scanner;

public class Date{
    public static void main(String [] args){
        int day, month, year, dayLimmit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for the day: ");
        day = sc.nextInt();
        if(day > 0 && day <= 31) {
            System.out.print("\nEnter a value for the month: ");
            month = sc.nextInt();
            if(month > 0 && month <= 12){
                System.out.print("\nEnter a value for the year: ");
                year = sc.nextInt();
                if(year >= 1970 && year <= 2018){
                    if(month == 2){
                        if(year%4 == 0){ // Leap Year
                            dayLimmit = 29;
                        }else{
                            dayLimmit = 28;
                        }
                    }else if(month == 4 || month == 6 || month == 9 || month == 11){
                         dayLimmit = 30;
                    }else{
                         dayLimmit = 31;
                    }
                    if(day <= dayLimmit){
                        System.out.println("The entered date "+ day +"-"+ month +"-"+ year +" is valid.");
                    }else{
                        System.out.println("The entered date "+ day +"-"+ month +"-"+ year +" is invalid.");
                    }
                }else {
                    System.out.println("Invalid value has been entered.");
                }
            }else{
                System.out.println("Invalid value has been entered.");
            }
        }else{
            System.out.println("Invalid value has been entered.");
        }



    }
}