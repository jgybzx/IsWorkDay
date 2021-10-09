package com.jgybzx.isworkday.mappers;

import com.jgybzx.isworkday.entity.LogSql;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author Jgybzx
 * @date 2021/9/24 9:31
 * des
 */
public interface LogSqlMapper {
    /**
     * 通过 model方式保存日志
     *
     * @param logSql 日志
     */
    void saveLogByModel(LogSql logSql);

    /**
     * 通过map方式保存日志
     *
     * @param map 日志
     */
    void saveLogByMap(@Param("map") Map<String, String> map);
}
