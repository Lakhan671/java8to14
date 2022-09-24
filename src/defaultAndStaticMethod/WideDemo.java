package defaultAndStaticMethod;

public class WideDemo {
    public static void main(String[] args) {
        WideDemo d=new WideDemo();

       d.a(1);
       int a= new Integer(2);
       d.a(a);
       Integer aa=12;
       d.a(aa);
       Integer aaa=new Integer(12);
       d.a(aaa);
       d.a(12.0);

    }

    void a(int a){
        System.out.println("int a");
    }
    void a(long a){
        System.out.println("long  a");
    }
    void a(float a){
        System.out.println("float a");
    }
    void a(double a){
        System.out.println("int double");
    }
    void a(Double a){
        System.out.println("DOUBLE a");
    }
    void a(Integer a){
        System.out.println("Integer a");
    }
    void a(String a){
        System.out.println("String a");
    }
}
