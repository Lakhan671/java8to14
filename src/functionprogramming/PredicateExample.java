package functionprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // if number >10 return true otherwise false
        Predicate<Integer> p1=(i)->i>10;
        System.out.println(p1.test(100));
        System.out.println(p1.test(6));
        //i>10 and even number
        Predicate<Integer>p2=(i)->i%2==0;
        System.out.println(p1.and(p2).test(20));
        // i>10 or even
        System.out.println(p1.or(p2).test(2));
        //i>10 && number is odd
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
