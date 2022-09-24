package factorymethodJava9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test23 {
    public static boolean solution(String S, String T) {
        String s = cal(S);
        String t = cal(T);
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='?' || t.charAt(i)=='?')
                continue;
            else if(s.charAt(i)!=t.charAt(i))
                return false;
        }
        return true;
    }

    public static String cal(String str){
        List<Character> charList = new ArrayList<>();
        int k=0;
        int l = str.length();

        while(k<l){
            char c = str.charAt(k);
            if(Character.isDigit(c)){
                int count = 0;
                while(k<l && Character.isDigit(str.charAt(k))){
                    count = (count*10) + (str.charAt(k)-'0');
                    k++;
                }
                k--;
                for(int a=0;a<count;a++){
                    charList.add('?');
                }
            }
            else{
                charList.add(str.charAt(k));
            }
            k++;
        }
        return charList.
                stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

    }

    public static void main(String[] args) {
        System.out.println(solution("A2Le","2pL1"));
        System.out.println(solution("a10","10a"));
    }
}
