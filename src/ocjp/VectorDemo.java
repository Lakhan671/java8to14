package ocjp;

import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Double> x = new Vector<Double>();
        Vector<Integer> y = new Vector<Integer>();
        System.out.print(x.getClass() == y.getClass());
        System.out.print(x.equals(y));
        System.out.println("\n--------------------------------------------");
        x.add(1.0);
        y.add(1);
        System.out.print(x.getClass() == y.getClass());
        System.out.print(x.equals(y));
    }
}