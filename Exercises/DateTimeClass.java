package Exercises;

import java.time.*;
import java.util.*;

public class DateTimeClass {
    public static void main(String args[]){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.set(Calendar.YEAR,2023);

        //System.out.println(c.getTime());

        // TO get current year,day,Month,minute,hour

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        //LocalDate , LocalTime , LocalDateTime

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        System.out.println(d.isLeapYear());
        System.out.println(t);



    }
}
