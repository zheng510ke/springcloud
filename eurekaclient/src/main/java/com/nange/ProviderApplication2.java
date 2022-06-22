package com.nange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//启动类会对当前类所在的所有子包的类进行扫描并存入到IOC容器
public class       ProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication2.class,args);
    }
}
