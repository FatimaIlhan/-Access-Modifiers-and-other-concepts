package WorkingwithEnums;

public class BasicEnumExample {
    public static void main(String[] args) {
        Weekday[] alldays = Weekday.values();
        for (Weekday days : alldays) {
            System.out.println(days);
        }
    }
}
