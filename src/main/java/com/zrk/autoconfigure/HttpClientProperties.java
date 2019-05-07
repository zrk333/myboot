package com.zrk.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/4/29
 */
@Data
@Component
@ConfigurationProperties(prefix = "zrk.httpclient")
@PropertySource(value = {"classpath:httpclient.properties"})
public class HttpClientProperties {

    private Integer connectTimeOut = 1000;

    private Integer socketTimeOut = 10000;

    private String agent = "agent";

    private Integer maxConnPreRoute = 10;

    private Integer maxConnTotal = 50;

}
