package stream;

import functionprogramming.Instructors;

import java.util.List;
import java.util.Optional;

public class MaxAndReduceExample {
    public static void main(String[] args) {
        List<Integer> integers=List.of(1,2,3,4,5,6,7,8);
        Optional number=integers.stream().max(Integer::compareTo);
        System.out.println(number.get());
        int result=integers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(result);
        Optional result2=integers.stream().reduce((a,b)->a>b?a:b);
        System.out.println(result2.get());
        Optional result3=integers.stream().reduce(Integer::sum);
        System.out.println(result3.get());
    }
}
