package functionprogramming;
@FunctionalInterface
interface FunDemo{

        public void subString(String x);
        public default void printd(){
        System.out.println("My name is lakhan singh");
    }
        public default void showName(){
        System.out.println("Please tell me your name");
    }
        public default String getMyName(){
        return "Lakhan Singh";
    }
        static void MyName(){
        System.out.println("My Name is Lakhan singh kumar");
    }
        static void doSomeStuff(){
        System.out.println("I'm writing the java code");
    }


}
public class FunctionDemo {
    public static void main(String[] args) {
        FunDemo f=(x)->{
            for(String s:x.split(",")){
                System.out.println(s);
            }
        };
        f.subString("Lakhan ,Singh");
    }




}
