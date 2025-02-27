package com.luv2code.crudDemo.deo;

import com.luv2code.crudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findStudents();
}
