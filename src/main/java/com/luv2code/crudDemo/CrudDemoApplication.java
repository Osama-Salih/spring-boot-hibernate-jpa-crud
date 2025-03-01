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
//			getStudents(studentDAO);
//			getStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Create multiple students");
		Student s1 = new Student("John", "Doe", "john@luv2code.com");
		Student s2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student s3 = new Student("bonita", "Applebum", "bonita@luv2code.com");

		studentDAO.save(s1);
		studentDAO.save(s2);
		studentDAO.save(s3);
	}

//	private void deleteAllStudents(StudentDAO studentDAO) {
//		System.out.println("Deleting all students");
//		int numRowsDeleted = studentDAO.deleteAll();
//		System.out.println("Numbers of rows deleted: " + numRowsDeleted);
//	}


//	private void deleteStudent(StudentDAO studentDAO) {
//		int studentId = 3;
//		System.out.println("Deleting student with id: " + studentId);
//		studentDAO.delete(studentId);
//	}

//	private void updateStudent(StudentDAO studentDAO) {
//		int studentId = 1;
//		System.out.println("Getting student with id: " + studentId);
//
//		Student student = studentDAO.findById(studentId);
//
//		System.out.println("Update student...");
//		student.setFirstName("John");
//
//		studentDAO.update(student);
//		System.out.println("Updated student: " + student);
//	}

//	private void getStudentsByLastName(StudentDAO studentDAO) {
//		List<Student> students = studentDAO.findStudentsByLastName("Duck");
//		for (Student s: students){
//			System.out.println(s);
//		}
//	}

//	private void getStudents(StudentDAO studentDAO) {
//		List<Student> students = studentDAO.findStudents();
//		for (Student s: students) {
//			System.out.println(s);
//		}
//	}


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
