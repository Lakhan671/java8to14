package interview;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FindMissingnumber {

    public static void main(String[] args) {
        List<Integer>integers=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        missingNumber(integers);
    }
    private static int missingNumber(List<Integer> numbers){
        //Collections.sort(numbers);

        int a=numbers.get(0);
        int n=numbers.size()+1;
        int d= numbers.get(1)-numbers.get(0);
        System.out.println(a+" "+n+" "+d);
        int s=(n/2)*(2*a+(n-1)*d);
        int s2=numbers.stream().reduce((a1, b)->a1+b).get();
        System.out.println(s-s2);
        System.out.println(s2);
        return 0;
    }
}
