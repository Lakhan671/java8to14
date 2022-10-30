package lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultDemo extends  Thread {
    public void run(){
        System.out.println(" before start");
        this.stop();
        System.out.println("after start");
    }
    public static void main(String[] args) {
        System.out.println(new Boolean("true")==new Boolean("kktrue"));
        DefaultDemo d=new DefaultDemo();
        d.start();

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
