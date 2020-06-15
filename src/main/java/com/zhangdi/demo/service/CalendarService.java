package com.zhangdi.demo.service;

import java.util.Calendar;
import java.util.Date;

public class CalendarService {
    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        return weekDays[w];
    }
}
