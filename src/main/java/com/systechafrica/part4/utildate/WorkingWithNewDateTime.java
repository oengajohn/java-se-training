package com.systechafrica.part4.utildate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;



public class WorkingWithNewDateTime {
    public static void main(String[] args) {
        // workingWithLocalDate();
        // workingWithLocalDateTime();
        workingWithLocalTime();

        Period p = Period.ofYears(10);
        Period pm = Period.ofMonths(5);

        Duration nineHours = Duration.ofHours(9);
        System.out.println("nineHours : " + nineHours);
        System.out.println("End time: " + LocalTime.now().plus(nineHours));
        System.out.println(p);
        System.out.println(pm);
        LocalDate localDate = LocalDate.now();
        System.out.println("10 years from  now: " + localDate.plus(p));
        System.out.println( "5 months from now: " + localDate.plus(pm));
        
    }

    private static void workingWithLocalTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime startTime = LocalTime.of(8, 0, 0);
        LocalTime endTime = startTime.plusHours(2).plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        System.out.println(formatter.format((endTime)));
    }

    private static void workingWithLocalDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
        // HH:mm:ss");
        // DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME; //default
        // formatter

        // DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; //
        // default formatter
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME; // default formatter
        System.out.println(formatter.format(currentTime));
        try {
            LocalDateTime localDate = LocalDateTime.parse("2023-10-20");
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date: " + e.getMessage() + " - Kindly enter a valid date time");
        }

    }

    private static void workingWithLocalDate() {
        // LocalDate, LocalDateTime, LocalTime are immutables
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        // immutable concept - unless reassigned then the date remains same
        todayDate.plusDays(5);
        // adding components
        LocalDate futureDate = todayDate.plusDays(5);
        System.out.println(futureDate);
        System.out.println(todayDate.plusMonths(2));
        System.out.println(todayDate.plusYears(2));

        System.out.println(LocalDate.of(1995, 5, 28));
        System.out.println(LocalDate.of(1995, Month.MAY, 28));

    }
}
