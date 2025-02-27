package com.luv2code.crudDemo;

import com.luv2code.crudDemo.deo.StudentDAO;
import com.luv2code.crudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Create student");
		Student student = new Student("Puel", "doe", "puel@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(student);

		System.out.println("Generated student with id: " + student.getId());
	}
}
