package factorymethodJava9;

import java.util.*;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("Lakhan");
        names.add("Kunal");
        names= Collections.unmodifiableList(names);
        System.out.println(names);
       // names.add("komal");
       // System.out.println(names);

        List<String> names2=List.of("LAkhan","kunal","Singh");
       // names2.add("singh");
        Set<String>names3=Set.of("Kunal","nilam","sonal");
        //Set<String>names33=Set.of("Kunal","nilam","sonal","sonal");
        Map<String,String>address=Map.of("city","Noida","state","UP");
        System.out.println(address);
    }
}
