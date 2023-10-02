package com.systechafrica.part4.utildate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WorkingWithUtilDate {
    public static void main(String[] args) {

        Date todayDate = new Date();
        System.out.println(todayDate);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 2);

        // add two days to the date
        System.out.println(calendar.getTime());

        //
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter date: ");
            String dateString = scanner.nextLine();
            // DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
            Date tomorrowDate = df.parse(dateString);
            System.out.println(df2.format(tomorrowDate));

            System.out.println(tomorrowDate.before(todayDate));
            System.out.println(tomorrowDate.after(todayDate));
            if (tomorrowDate.after(todayDate)) {
                System.out.println("valid date");
            }else{
                System.out.println("please enter future date");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
