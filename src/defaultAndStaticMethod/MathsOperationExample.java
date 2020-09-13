package defaultAndStaticMethod;


public class MathsOperationExample  implements Calculator {
    public static void main(String[] args) {
        MathsOperationExample mathsOperationExample=new MathsOperationExample();
        System.out.println(mathsOperationExample.sum(3,2));
        System.out.println(mathsOperationExample.divide(4,2));
        Calculator calculator=(a,b)->a%b;
        System.out.println(calculator.sum(3,2));
        System.out.println(calculator.sum(3,5));
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    //@Override
    public int divide(int a, int b) {
        return a/b;
    }
}
