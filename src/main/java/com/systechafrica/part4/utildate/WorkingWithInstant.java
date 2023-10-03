package com.systechafrica.part4.utildate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class WorkingWithInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);
        System.out.println("now = " + LocalDateTime.now());
        System.out.println("now.getEpochSecond() = " + now.getEpochSecond());
        System.out.println("now.plus() = " + now.plus(3600, ChronoUnit.SECONDS));

        ZonedDateTime nowZ = ZonedDateTime.now();
//        System.out.println("ZoneId.getAvailableZoneIds() = " + ZoneId.getAvailableZoneIds());
        ZonedDateTime nowChicago = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("nowZ = " + nowZ);
        System.out.println("nowChicago = " + nowChicago);

        OffsetDateTime nowOffset = OffsetDateTime.now();
        System.out.println("nowOffset = " + nowOffset);
    }
}
