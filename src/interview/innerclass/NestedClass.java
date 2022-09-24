package interview.innerclass;

public class NestedClass {
    int a=10;
    public void print(){
        System.out.println("From enclosing");
    }
    public class Inner{
        int a=90;
        public void print(){
            System.out.println("from inner"+this
            .a);
        }
        public void printAll(){
            this.print();
            NestedClass.this.print();
            callMe(5);
            callMe();
            System.out.println("hello"==new String("hello"));
        }
    }

    public static void main(String[] args) {
        NestedClass.Inner inner=new NestedClass().new Inner();
        inner.printAll();
    }
    static void callMe(byte b){
        System.out.println("byte");
    }
    static void callMe(int... aa){
        System.out.println("int");
    }
}
