package java12;
import java.time.LocalDate;
//Java 12 introduces expressions to Switch statement and released it as a preview feature.
// Java 13 added a new yield construct to return a value from switch statement.
// With Java 14, switch expression now is a standard feature.
//Each case block can return a value using yield statement.
//In case of enum, default case can be skipped. In other cases, default case is required.

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        System.out.println("Quarter           = " + java12Switch("DECEMBER"));
        System.out.println("Weekend Or Weekday= " + java14Switch("Saturday"));
    }

    // java 12 switch Expressions
    public static String java12Switch(String month) {
        String quarter = switch (month) {
            case "JANUARY", "FEBURARY", "MARCH" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR" : "FIRST QUARTER");
            }
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        return quarter;
    }

    // java 14 switch expressions
    public static String java14Switch(String day) {
        var result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                yield "Weekday";
            case "Saturday", "Sunday":
                yield "Weekend";
            default:
                yield "Invalid day.";
        };
        return result;
    }
}
