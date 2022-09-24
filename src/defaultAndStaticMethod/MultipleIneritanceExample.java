package defaultAndStaticMethod;

public class MultipleIneritanceExample implements  InterfaceB,InterfaceA, InterfaceC {
    public static void main(String[] args) {
        MultipleIneritanceExample multipleIneritanceExample = new MultipleIneritanceExample();
        multipleIneritanceExample.sumA(4,8);  // resolve to child
        multipleIneritanceExample.sumB(2,4);
        multipleIneritanceExample.sumC(1,2);
      A1 c=  new C2();
      c.a();
      c=  new A1();
      c.a();
      A1 a=new B2();
      a.a();
    }

    // implemented class first
    // the sub interface that extends the interface


}

class A1{
    A1(){
        System.out.println("A1 constructor");
    }
    {
        System.out.println("A1 block");
    }
    static {
        System.out.println("A1 static block");
    }
    public void a(){
        System.out.println("A1 method call");
    }
}
class B2 extends  A1{
    B2(){
        System.out.println("B2 constructor");
    }
    {
        System.out.println("B2 block");
    }
    static {
        System.out.println("B2 static block");
    }
    public void a(){
        System.out.println("B2 method call");
    }
}
class C2 extends  B2{
    C2(){
        System.out.println("C2 constructor");
    }
    {
        System.out.println("C2 block");
    }
    static {
        System.out.println("C2 static block");
    }
    public void a(){
        System.out.println("C2 method call");
    }
}
