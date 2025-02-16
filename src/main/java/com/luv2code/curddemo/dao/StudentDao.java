package com.luv2code.curddemo.dao;
import com.luv2code.curddemo.entity.Student;

public interface  StudentDao {
    public void save(Student theStudent);
    public Student findById(Integer id);
}
