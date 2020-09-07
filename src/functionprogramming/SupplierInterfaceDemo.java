package functionprogramming;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()->(int)(Math.random()*1000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }
}
