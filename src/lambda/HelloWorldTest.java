package lambda;

public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface=()->{
            System.out.println("my name is Lakhan Singh");
           return "test hello";
        };
        HelloWorldInterface helloWorldInterface2=() ->"test hello 2";
        System.out.println(helloWorldInterface.display()+" " +helloWorldInterface2.display());
    }
}
