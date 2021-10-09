package com.jgybzx.isworkday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Jgybzx
 */
@SpringBootApplication
@MapperScan("com.jgybzx.isworkday.mappers")
@EnableTransactionManagement
@EnableScheduling
public class IsWorkDayApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsWorkDayApplication.class, args);
    }

}
