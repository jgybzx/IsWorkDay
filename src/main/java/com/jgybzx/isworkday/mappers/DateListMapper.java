package com.jgybzx.isworkday.mappers;

import com.jgybzx.isworkday.model.DateList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author Jgybzx
 * @date 2021/9/23 17:31
 * des
 */
@Component
public interface DateListMapper {
    /**
     * 保存放假时间
     *
     * @param list 时间
     * @author jgybzx
     * @date 2021/9/24 9:29
     */
    void saveList(@Param("list") List<DateList> list);

    /**
     * 获取本月所有非工作日集合
     *
     * @param firstDay 本月第一天
     * @param lastDay  本月最后一天
     * @return java.util.List<com.jgybzx.isworkday.model.DateList>
     * @author jgybzx
     * @date 2021/9/26 15:49
     */
    List<DateList> getHolidayListCurrentMonth(String firstDay, String lastDay);

    /**
     * 根据日期查询数据
     *
     * @param currentDay 当前日期
     * @return com.jgybzx.isworkday.model.DateList
     * @author jgybzx
     * @date 2021/9/26 16:00
     */
    DateList isHoliday(String currentDay);
}
