package concurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CommonLongestSubstring {
    private static int longSubstr(String s){
        Map<Character,Character>map=new HashMap<>();
          for(char c: s.toCharArray()){
              if(!map.containsKey(c)){
                  map.put(c,c);
              }
          }
        Map<Character,Character>map2=new HashMap<>();
        TreeMap<Integer,String>t=new TreeMap<>();
          for(int i=0;i<s.length();i++){
              map2.putAll(map);
              for(int j=i;j<s.length();j++){
                 if(map2.containsKey(s.charAt(j))){
                    map2.remove(s.charAt(j)) ;

                 }else{

                     if(map2.size()==0){
                         t.put(s.substring(i,j).length(),s.substring(i,j));
                     }
                 }
              }
          }
        //
        System.out.println(t);
        System.out.println(map);
        return 1;
    }

    public static void main(String[] args) {
        String s="geeksforgeeks";
        longSubstr(s);
    }
}
