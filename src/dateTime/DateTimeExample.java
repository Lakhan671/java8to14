package dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yy-dd-MM");
        System.out.println(dateFormat.format(date));
        dateFormat=new SimpleDateFormat("HH:mm:ss");
        System.out.println(dateFormat.format(date));
        System.out.println(Calendar.getInstance().getTime());

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime  localTime=LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
