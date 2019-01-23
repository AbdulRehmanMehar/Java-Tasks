import java.util.Scanner;

public class TemperatureConverter{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter C if convert to Celcuis or F if convert to Farehnheight.");
    char unit = sc.next().toLowerCase().charAt(0);
    System.out.println("Enter temperature");
    double temp = sc.nextDouble();
    convert(temp, unit);
  }
  public static void convert(double value, char unit){
    double calc = 0;
    if(unit == 'f'){
      calc = (9 / 5) * value + 32;
      System.out.print(value + "C is equal to " + calc + "F");
    }else{
      calc =  5 / 9  * ( value - 32);
      System.out.print(value + "F is equal to " + calc + "C");
    }
  }
}
