package com.jgybzx.isworkday.controller;

import cn.hutool.json.JSONUtil;
import com.jgybzx.isworkday.config.Holiday;
import com.jgybzx.isworkday.mappers.DateListMapper;
import com.jgybzx.isworkday.model.*;
import com.jgybzx.isworkday.utils.HolidayUtil;
import com.jgybzx.isworkday.utils.WeekEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jgybzx
 * @date 2021/9/23 16:44
 * des
 */
@RestController
@RequestMapping("/isWorkday")
public class IsHolidayController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DateListMapper mapper;
    @Autowired
    private Holiday holiday;
    @Autowired
    private HttpServletRequest request;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    @GetMapping("/today")
    public Map<String, Object> isHoliday() {
        LocalDate now = LocalDate.now();
        String date = request.getHeader("date");
        now = (StringUtils.isEmpty(date)) ? now : LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String firstDay = now.with(TemporalAdjusters.firstDayOfMonth()).toString();
        String lastDay = now.with(TemporalAdjusters.lastDayOfMonth()).toString();
        String currentDay = now.toString();
        DateList dateList = mapper.isHoliday(currentDay);
        Map<String, Object> result = new HashMap<>(16);
        int value = now.getDayOfWeek().getValue();
        if (!ObjectUtils.isEmpty(dateList)) {
            String status = dateList.getStatus();
            result.put("info", ("1".equals(status) ? "今天不上班" : "今天虽然是周末，但是调休上班"));
        } else {
            result.put("info", (value == SATURDAY || value == SUNDAY) ? "今天周末不上班" : "今天上班");
        }
        result.put("weekDay",WeekEnum.getNameByValue(value));
        result.put("test","自动化部署测试");
        return result;
    }

    @Scheduled(cron = "0 0 2 1 * ? ")
    @GetMapping("getHoliday")
    public void getHoliday() {
        // 每月1号2点执行
        String url = holiday.getUrl();
        String s = HolidayUtil.doGet(url);
        HolidayResult holidayResult = JSONUtil.toBean(s, HolidayResult.class);
        List<Holiday_array> holidayArrayList = holidayResult.getResult().getData().getHoliday_array();
        List<DateList> dateLists = new ArrayList<>();
        for (Holiday_array holidayArray : holidayArrayList) {
            List<DateList> list = holidayArray.getList();
            dateLists.addAll(list);
        }
        mapper.saveList(dateLists);
    }

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now.getDayOfWeek().getValue() = " + now.getDayOfWeek().getValue());
        WeekEnum mon = WeekEnum.MON;
        int ordinal = mon.ordinal();

    }
}
