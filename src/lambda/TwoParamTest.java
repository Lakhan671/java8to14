package lambda;

public class TwoParamTest {
    public static void main(String[] args) {
        TwoParamInterface twoParamInterface=(a,b)->a+b;
        System.out.println(twoParamInterface.twoParamAdd(2,5));
    }
}
