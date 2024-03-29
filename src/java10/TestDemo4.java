package java10;


import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo4  {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(validate("lakhan.singh1871@gmail.com"));
    }






}


