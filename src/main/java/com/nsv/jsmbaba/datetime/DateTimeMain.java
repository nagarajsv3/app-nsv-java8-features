package com.nsv.jsmbaba.datetime;

import java.time.*;
import java.util.concurrent.TimeUnit;

public class DateTimeMain {
    public static void main(String[] args) throws InterruptedException {

        Instant t = Instant.now();
        System.out.println("t ="+t);
        TimeUnit.SECONDS.sleep(2);
        Instant t1 = Instant.now();
        System.out.println("t1="+t1);
        Duration duration = Duration.between(t, t1);
        System.out.println("duration="+duration);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("EST")));


    }
}
