package com.systechafrica.part2.staticclasses;

public class StringUtils {
    public static boolean isNullOrEmpty(String s) {
        return s==null || s.isEmpty();
    }
    public static boolean isNull(String s) {
        return s==null ;
    }
    public static boolean isEmpty(String s) {
        return s.isEmpty();
    }
    public static int length(String s) {
        return s.length();
    }
    public static String trim(String s){
        return s.trim(); //    john   
    }
}
