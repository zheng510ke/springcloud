package com.nange.controller;

import com.nange.entity.Student;
import com.nange.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired //从ioc容器取出实例化对象并注入到当前变量
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index() {
        return "当前端口：" + this.port;
    }
}
