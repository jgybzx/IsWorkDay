package com.jgybzx.isworkday.utils;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author Jgybzx
 * @date 2021/9/23 15:39
 * des
 */
public class HolidayUtil {

    public static String doGet(String url) {
        try {
            CloseableHttpClient build = HttpClientBuilder.create().build();
            //发送get请求
            HttpGet request = new HttpGet(url);
            CloseableHttpResponse response = build.execute(request);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }



}
