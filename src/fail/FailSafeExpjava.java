package fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExpjava {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> expJavaMap = new ConcurrentHashMap<>();
        expJavaMap.put(1,"java questions");
        expJavaMap.put(2,"Ocjp question");
        expJavaMap.put(3,"OCA question");

        Iterator it = expJavaMap.keySet().iterator();
        while (it.hasNext()) {
            int key = (int) it.next();
            // This will reflect in iterator.
            // This means it has not created separate copy of objects
            expJavaMap.put(4,"angular Test");
        }

        //OR
        for(Map.Entry<Integer,String> entry:expJavaMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            expJavaMap.put(3,"expjava, Hibernate questions");

        }

    }
}
