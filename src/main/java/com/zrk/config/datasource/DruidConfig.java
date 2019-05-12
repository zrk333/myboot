package com.zrk.config.datasource;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/5/12
 */
@Configuration
public class DruidConfig {

//    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,String> initParam = new HashMap<>();
        initParam.put("loginUsername","zrk");
        initParam.put("loginPassword","123456");
//        initParam.put("allow","");
//        initParam.put("deny","");

        bean.setInitParameters(initParam);
        return bean;
    }
}
