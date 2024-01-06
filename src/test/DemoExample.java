package test;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoExample {
    public static void main(String[] args) {
        List<Integer>list=List.of(11,23,11,12,45,90,12,45);
        Map<Integer, Integer>map=new HashMap<>();
        for(int i:list){
            if(map.containsKey(i)){
                System.out.println(i);
            }else {
                map.put(i,1);
            }

        }


    }
}
