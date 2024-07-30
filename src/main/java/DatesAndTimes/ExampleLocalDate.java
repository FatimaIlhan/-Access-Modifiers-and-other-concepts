package DatesAndTimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate d1 = LocalDate.of(1994,12,3);
        LocalDate ld2 = LocalDate.parse("1993-12-03");
        //altering local date
        LocalDate ld3 = today.plusDays(5);
        System.out.println(today);
        System.out.println(ld3);
        System.out.println(d1);
        System.out.println(ld2);

    }
}
