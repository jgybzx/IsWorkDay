package com.jgybzx.isworkday.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static com.jgybzx.isworkday.utils.BasicConstants.*;

/**
 * @author Jgybzx
 * @date 2021/9/24 9:48
 * des
 */
@Component
@ConfigurationProperties(prefix = "holiday")
public class Holiday {
    private String url;
    private String key;

    public String getUrl() {
        LocalDate now = LocalDate.now();
        String year = now.getYear() + "-" + now.getMonth().getValue();
        return url + "?" + YEAR_MONTH + "=" + year + "&" + KEY + "=" + key;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
