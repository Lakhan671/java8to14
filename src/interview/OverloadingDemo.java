package interview;

public class OverloadingDemo {
    public static void main(String[] args) {
    disp("8");
    }
   /* private static void disp(String str){
        System.out.println("str");
        System.out.println(str);
    }*/
    private static void disp(Long id){
        System.out.println(id);
    }
    private static void disp(Object obj){
        System.out.println("obj");
        System.out.println(obj);
    }
}
