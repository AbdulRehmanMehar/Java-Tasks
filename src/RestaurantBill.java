public class RestaurantBill {
    public static void main(String [] args){
        double price = 500;
        System.out.println("Price of meal is "+ price);
        price += price * 6.75 / 100; // Price after adding 6.75 percent tax
        System.out.println("Price of meal after adding 6.75 percent tax is "+ price);
        price += price * 20 / 100; // Price after adding 20 percent tip
        System.out.println("Price of meal after adding 20 percent tip along with 6.25 percent tax is "+ price);
    }
}
