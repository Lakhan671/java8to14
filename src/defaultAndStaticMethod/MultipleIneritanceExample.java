package defaultAndStaticMethod;

public class MultipleIneritanceExample implements  InterfaceB,InterfaceA, InterfaceC {
    public static void main(String[] args) {
        MultipleIneritanceExample multipleIneritanceExample = new MultipleIneritanceExample();
        multipleIneritanceExample.sumA(4,8);  // resolve to child
        multipleIneritanceExample.sumB(2,4);
        multipleIneritanceExample.sumC(1,2);
    }

    // implemented class first
    // the sub interface that extends the interface


}
