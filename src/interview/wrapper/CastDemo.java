package interview.wrapper;

public class CastDemo {
    public static void main(String[] args) {
        int i=1;
        long l=i;
        byte b=1;
        short s=b;
        float f=2.0f;
        l= (long) f;
        char c= Character.highSurrogate(s);
        boolean bb=true;
        //i=bb;

    }
    public long sum(long a,long b){
        return a+b;

    }
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(long a,int b){
        return 0;
    }


}
