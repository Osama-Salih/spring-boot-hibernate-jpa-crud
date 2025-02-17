package com.luv2code.curddemo.dao;
import com.luv2code.curddemo.entity.Student;

import java.util.List;

public interface  StudentDao {
    public void save(Student theStudent);
    public Student findById(Integer id);
    public List<Student> findAll();
    public List<Student> findByLastName(String lastName);
    public void update(Student theStudent);
}
