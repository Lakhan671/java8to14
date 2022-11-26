package lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultDemo extends  Thread {
    public void run(){
        System.out.println("before start");
        this.stop();
        System.out.println("after start");
    }
    public static void main(String[] args) {
        System.out.println(new Boolean("true")==new Boolean("true"));
        DefaultDemo d=new DefaultDemo();
        d.start();
    }
}
