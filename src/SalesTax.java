public class SalesTax {
    public static void main(String [] args) {
        double amount = 500,
                countryTax = amount * 2 / 100,
                salesTax = amount * 4 / 100,
                totalTax = countryTax + salesTax;
        System.out.println("Item with amount "+ amount+ " has Country Tax "+ countryTax + " and Sales Tax "+ salesTax+" and Total Tax of "+ totalTax);
    }
}
