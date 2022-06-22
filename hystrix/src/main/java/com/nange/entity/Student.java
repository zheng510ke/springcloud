package com.nange.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor //构造函数
@NoArgsConstructor //无参构造
//@NotEmpty //加了@NotEmpty的String类、Collection、Map、数组，是不能为null或者长度为0的(String Collection Map的isEmpty()方法)
public class Student {
    private long id;
    private String name;
    private int age;
}
