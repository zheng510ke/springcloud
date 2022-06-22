package com.nange.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor //构造函数
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
