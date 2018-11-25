public class Sales {
    public static void main(String [] args){
        double revenue = 4.6e6,
            margin = 62,
            profit = revenue * margin / 100,
            cost = revenue - profit;
        System.out.println("$" + profit + " is profit of revenue $"+ revenue + " and cost is $"+ cost);
    }
}
