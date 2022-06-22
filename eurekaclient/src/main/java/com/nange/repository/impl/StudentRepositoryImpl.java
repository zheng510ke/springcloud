package com.nange.repository.impl;

import com.nange.entity.Student;
import com.nange.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository //标识为IOC容器的一个bean，用以被IOC扫描进去
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static{
        studentMap =new HashMap<>();
        studentMap.put(1l,new Student(1l,"张三",23));
        studentMap.put(2l,new Student(2l,"李四",24));
        studentMap.put(3l,new Student(3l,"王五",25));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
