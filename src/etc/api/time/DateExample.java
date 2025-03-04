package etc.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getMonth());

        System.out.println("====================================");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

    }

}
