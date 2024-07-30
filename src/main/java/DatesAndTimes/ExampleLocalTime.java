package DatesAndTimes;

import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(6,30 ,12);
        LocalTime lt3 = LocalTime.parse("7:22:50");

    }
}
