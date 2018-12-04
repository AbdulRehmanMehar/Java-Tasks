import java.util.Scanner;

public class GradeCalculationLab5{
    public static void main(String [] args){
        int marks;
        char grades;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your marks");
        marks = sc.nextInt();
        if(marks >= 100){
            System.out.println("Invalid Input. Please Enter marks between 0 and 100");
            return; // Stops the Program execution
        }else if(marks >= 90){
            grades = 'A';
        }else if(marks >= 80){
            grades = 'B';
        }else if(marks >= 70){
            grades = 'C';
        }else if(marks >= 60){
            grades = 'D';
        }else{
            grades = 'F';
        }
        System.out.println("Your Grade is "+ grades);
        sc.close();
    }
}