package com.luv2code.crudDemo;

import com.luv2code.crudDemo.deo.StudentDAO;
import com.luv2code.crudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;


@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
//			findStudentById(studentDAO);
			getStudents(studentDAO);
		};
	}

	private void getStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findStudents();
		for (Student s: students) {
			System.out.println(s);
		}
	}


//	private void findStudentById(StudentDAO studentDAO) {
//		System.out.println("Creating student");
//		Student student = new Student("Daffy", "Duck", "daffy@luv2code.com");
//
//		System.out.println("Saving the student");
//		studentDAO.save(student);
//
//		System.out.println("Display the id for the saved student: " + student.getId());
//
//		System.out.println("Get the student by id");
//		Student savedStudent = studentDAO.findById(student.getId());
//		System.out.println("student data: " + savedStudent);
//	}

//	private void createStudent(StudentDAO studentDAO) {
//
//		System.out.println("Create student");
//		Student student = new Student("Puel", "doe", "puel@gmail.com");
//
//		System.out.println("Saving the student");
//		studentDAO.save(student);
//
//		System.out.println("Generated student with id: " + student.getId());
//	}
}
