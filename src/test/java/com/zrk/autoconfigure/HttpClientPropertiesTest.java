package com.zrk.autoconfigure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/4/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpClientPropertiesTest {

    @Autowired
    private HttpClientProperties httpClientProperties;

    @Test
    public void getHttpClient() {
        System.out.println(httpClientProperties);
    }
}