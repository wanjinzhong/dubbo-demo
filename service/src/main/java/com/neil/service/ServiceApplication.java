package com.neil.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo
public class ServiceApplication {

    public static void main(String[] args) {
        // run with non-web
        new SpringApplicationBuilder(ServiceApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
