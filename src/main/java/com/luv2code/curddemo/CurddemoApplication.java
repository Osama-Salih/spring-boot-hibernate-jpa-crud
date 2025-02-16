package com.luv2code.curddemo;

import com.luv2code.curddemo.dao.StudentDao;
import com.luv2code.curddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;


@SpringBootApplication
public class CurddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
//			createStudent(studentDao);
//			createMultipleStudents(studentDao);
//			readStudent(studentDao);
			queryForStudents(studentDao);
		};
	}

	private void queryForStudents(StudentDao studentDao) {
		// get list of students
		List<Student> theStudents = studentDao.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}


//	private void readStudent(StudentDao studentDao) {
//
//		// create a student object
//		System.out.println("Creating new student object...");
//		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
//
//		// save the student object
//		System.out.println("Saving the student...");
//		studentDao.save(tempStudent);
//
//		// display id of the saved student
//		System.out.println("Saved student. Generated id: " + tempStudent.getId());
//
//		// retrieve student based on the id: primary key
//		System.out.println("\n Retrieving student with id: " + tempStudent.getId());
//
//		Student myStudent = studentDao.findById(tempStudent.getId());
//
//		System.out.println("Found the student: " + myStudent);
//	}

//	private void createMultipleStudents(StudentDao studentDao) {
//		// Create the student object
//		System.out.println("Creating new student object ...");
//		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
//		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
//		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
//		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
//
//		// sava the student object
//		System.out.println("Saving the student ...");
//		studentDao.save(tempStudent);
//		studentDao.save(tempStudent1);
//		studentDao.save(tempStudent2);
//		studentDao.save(tempStudent3);
//	}
//
//	private void createStudent(StudentDao studentDao) {
//
//		// Create the student object
//		System.out.println("Creating new student object ...");
//		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
//
//		// sava the student object
//		System.out.println("Saving the student ...");
//		studentDao.save(tempStudent);

		// display the id of the saved object
//		System.out.println("Saved student. Generated id: " + tempStudent.getId());
//	}

}
