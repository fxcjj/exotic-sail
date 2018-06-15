package com.vic.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Hello world!
 */
public class DateTimeUtils {

    private static final String YYYY_MM_DD_HH_MM_SS = "";

    /**
     * 获取当前日期
     * @return
     */
    public static String currentDate() {
        return LocalDate.now().toString();
    }

    /**
     * 获取当前日期时间
     * @return
     */
    public static String currentDateTime() {
        return LocalDateTime.now().toString();
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String currentTime() {
        return LocalTime.now().toString();
    }


    public static void main(String[] args) {
        System.out.println(currentDate());
    }
}
