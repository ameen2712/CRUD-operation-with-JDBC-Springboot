package com.jdbc.jdbcexample.Repository;

import com.jdbc.jdbcexample.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
    void update(int id, Student student);
    void delete(int id);
}
