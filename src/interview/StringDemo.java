package interview;

public class StringDemo {
    public static void main(String[] args) {
        String st="helloword";
        String s1="hello"+"word";
        System.out.println(s1==st);
        final String   s11="hello";
        final String st22="word";
        String s3=s11+st22;
        System.out.println(s1==s3);
        System.out.println(st==new String(st));
    }
}
