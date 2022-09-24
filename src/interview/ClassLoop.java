package interview;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ClassLoop  extends  A{
    public static void main(String[] args) {
        A a=new A();
        a.printA();
        TreeMap<Integer,String> set=new TreeMap<>();
        set.lastEntry();
    }
}
class A {//extends ClassLoop{
    void printA(){
        System.out.println("A");
    }
}
