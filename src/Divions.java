public class Divions {
    public static void main(String [] args){
        double statement1 = 6 / 3; // truncates floating points
        double statement2 = 12 / 5; // Truncates floating points
        double statement3 = 12 % 5;
        double statement4 = 12 / 5.0;
        double statement5 = 12.0 / 3.0;
        double statement6 = 1 / 3; // Results 0.0 because none of the operands a float, Truncates the last floating points
        double statement7 = 12.0 % 3.0;
        System.out.println("Understanding the difference between integer and floating division in java");
        System.out.println("6 / 3 = " + statement1);
        System.out.println("12 / 5 = " + statement2);
        System.out.println("12 % 5 = " + statement3);
        System.out.println("12 / 5.0 = " + statement4);
        System.out.println("12.0 / 3.0 = " + statement5);
        System.out.println("1 / 3 = " + statement6);
        System.out.println("12.0 % 3.0 = " + statement7);

    }
}
