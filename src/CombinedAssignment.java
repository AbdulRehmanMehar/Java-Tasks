public class CombinedAssignment {
    public static void main(String [] args) {
        int x = 6;
        System.out.println("x is " + x);
        x -= 4;
        System.out.println("x -4 || x-=4 is " + x);
        x *= 4;
        System.out.println("(x -4) * 4  || x*=4 is " + x);
        x /= 27;
        System.out.println("( (x-4) * 4 ) / 27  || x/=27 is " + x);
        x %= 7;
        System.out.println(" ( ( (x-4) *4) / 27) % 7) || x%=7 is " + x);
    }
}
