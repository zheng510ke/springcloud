package com.nange.feign;

import com.nange.entity.Student;
import com.nange.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value = "PROVIDER",fallback = FeignError.class) // 设置此接口需要请求的微服务在注册中心的应用名称
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
