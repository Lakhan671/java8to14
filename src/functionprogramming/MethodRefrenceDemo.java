package functionprogramming;

public class MethodRefrenceDemo {
    public static void main(String[] args) {
        FunctionT functionT=TestDemo::printme;
        functionT.test();
    }
}

class  TestDemo{

    public  static  void printme(){
        System.out.println("print me");
    }
}
@FunctionalInterface
interface  FunctionT{
    public void test();

}