public class Ingredients {
    public static void main(String [] args){
        final int cookies = 48;
        double sugar = 1.5 / cookies,
            butter = 1.0 / cookies,
            flour = 2.75 / cookies;
        int reqCookies = 13;
        System.out.println(reqCookies * sugar + " Cups of Sugar & "+ reqCookies * butter + " Cups of Butter & " + reqCookies * flour+ " Cups of Flour are required to make "+ reqCookies + " cookies.");
    }
}
