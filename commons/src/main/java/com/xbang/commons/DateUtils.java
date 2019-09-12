package com.xbang.commons;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");


    public static String getDateFormatTradeNo(){
        return DATE_TIME_FORMATTER.format(LocalDateTime.now());
    }

}
