public class Temperature{
    public static void main(String [] args){
        double tempCentigrade, tempFahrenheit, farn2centi, centi2farn;
        tempFahrenheit = 68.5;
        tempCentigrade =  -273.15;
        farn2centi = (tempFahrenheit - 32) * 5 / 9;
        centi2farn = ( tempCentigrade * 9 / 5 ) + 32;
        System.out.println(tempFahrenheit + " Fahrenheit is equal to " + farn2centi + " Celsius");
        System.out.println(tempCentigrade + " Centigrade is equal to " + centi2farn + " Fahrenheit");
    }
}