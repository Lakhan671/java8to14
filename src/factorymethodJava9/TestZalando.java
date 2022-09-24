package factorymethodJava9;

public class TestZalando {

    static int solution(String s) {
        int length = s.length();
        if (length < 2)
            return 0;

        int i = 0, mid = length / 2;
         for(;mid < length;) {
            if (s.charAt(mid) == s.charAt(i)) {
                ++i;
                ++mid;
            } else {
                if (i == 0)
                    ++mid;
                else
                    --i;
            }
        }
        return i;

    }

    public static void main(String[] args) {

        String s = "abbabba";
        System.out.println(solution(s));

    }
}
