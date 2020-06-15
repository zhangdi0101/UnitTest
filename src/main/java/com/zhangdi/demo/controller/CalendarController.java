package com.zhangdi.demo.controller;

import com.zhangdi.demo.service.CalendarService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Validated
@RestController
@RequestMapping("/api/calendar")
public class CalendarController {
    @GetMapping()
    public String getDayOfWeekByDate(){
        Date now = new Date();
        return CalendarService.getWeekOfDate(now);
    }
}
