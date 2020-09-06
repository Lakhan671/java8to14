package lambda;

public class IncrementByFiveTest {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface=(a)->a+5;
        System.out.println(incrementByFiveInterface.increment(2));
    }
}
