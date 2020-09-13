package defaultAndStaticMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultDemo {
    public static void main(String[] args) {
        List<String> namesList= Arrays.asList("Mike","Syed","Jenny");
        //Collections.sort(namesList);
        System.out.println(namesList);
        namesList.sort(Comparator.naturalOrder());
        System.out.println(namesList);
    }
}
