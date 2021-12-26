package com.jpdev.utils;

import java.util.Calendar;
import java.util.Date;

public class CustomDateUtils {

    public static Date sumDays(Date date, Integer numberOfDays) {
        Calendar calculatedDate = Calendar.getInstance();
        calculatedDate.setTime(date);
        calculatedDate.add(Calendar.DAY_OF_MONTH, numberOfDays);

        return calculatedDate.getTime();
    }

}
