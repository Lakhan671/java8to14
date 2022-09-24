package interview;

public class ArmstrongExample {
    public static void main(String[] args) {
        System.out.println( getCal(153)==153);;
    }
    private static int getCal(int n){
        return n>0?((n%10)*(n%10)*(n%10)+getCal(n/10)):0;
    }
}
