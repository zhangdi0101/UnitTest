package com.zhangdi.demo.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.Assert.*;

public class CalendarServiceTest {

    @Test
    public void testGetWeekOfDate() {
        String dateStr = "2020-06-15";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(dateStr);
            Assert.assertEquals(CalendarService.getWeekOfDate(date),"星期一","获取日期不符合预期");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}