public class Expressions {
    public static void main(String [] args){
        int statement1 = 6 + 3 * 5; // DMAS
        int statement2 = 12 / 2 - 4;
        int statement3 = 9 + 14 * 2 - 6;
        int statement4 = 5 + 19 % 3 - 1;
        int statement5 = (6 + 2) * 3;
        int statement6 = 14 / (11 - 4);
        int statement7 = 9 + 12 * (8 - 3);
        System.out.println("Understanding the evaluation order of operators");
        System.out.println("6 + 3 * 5 is equal to " + statement1);
        System.out.println("12 / 2 - 4 is equal to " + statement2);
        System.out.println("9 + 14 * 2 - 6 is equal to " + statement3);
        System.out.println("5 + 19 % 3 - 1 is equal to " + statement4);
        System.out.println("(6 + 2) * 3 is equal to " + statement5);
        System.out.println("14 / (11 - 4) is equal to " + statement6);
        System.out.println("9 + 12 * (8 - 3) is equal to " + statement7);
    }
}
