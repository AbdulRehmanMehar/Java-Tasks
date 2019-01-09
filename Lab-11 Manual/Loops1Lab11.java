import java.util.Scanner;

public class Loops1Lab11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt(),
        sum = 0,
        count = 1,
        largest = age,
        smallest = age;
    while(age != -999){
      if(age < smallest){
        smallest = age;
      }else if(age > largest){
        largest = age;
      }
      sum += age;
      count ++;
      System.out.print("Enter your age: ");
      age = sc.nextInt();
    }
    double avg = sum / count;
    System.out.print("Average of age is: " + avg);
  }
}
