package com.nange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

@EnableZuulProxy //生成网关代理，包含了@EnableZuulServer注解，设置该类是网关的启动类
@EnableAutoConfiguration //自动装载配置，可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前应用创建并使用的IOC容器
public class GetwayZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetwayZullApplication.class,args);
    }
}
