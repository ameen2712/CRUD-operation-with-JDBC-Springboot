package com.jdbc.jdbcexample.Service;

import com.jdbc.jdbcexample.Repository.StudentRepository;
import com.jdbc.jdbcexample.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void save(Student student) {
        studentRepository.save(student);
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void update(int id, Student student) {
        studentRepository.update(id, student);
    }

    public void delete(int id) {
        studentRepository.delete(id);
    }
}
