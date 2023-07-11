package com.maqant.springboot.demo.myfirstapp;

import com.maqant.springboot.demo.myfirstapp.dao.StudentDAO;
import com.maqant.springboot.demo.myfirstapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MyfirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstappApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudent(studentDAO);
		};
	}*/

	private void deleteAllStudent(StudentDAO studentDAO) {
		int deletedNumDeleted = 0;
		deletedNumDeleted = studentDAO.deleteAll();
		System.out.println("Number of Deleted Students : " + deletedNumDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 11;
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve student based on id
		int studentId = 1;
		Student myStudent = studentDAO.findById(studentId);
		System.out.println(myStudent);
		//change first name
		myStudent.setFirstName("Antuan");
		//Update the student
		studentDAO.update(myStudent);
		//display updated student
		System.out.println("Updated Student : " + myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Goof");
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//Create the student
		Student tempStudent = new Student("Lew", "Mob", "lewisfog@gmail.com");
		//Save the student
		studentDAO.save(tempStudent);
		//Retrieve the student ID
		Integer theId = tempStudent.getId();
		//Retrieve the student object via ID
		Student newStudent = studentDAO.findById(theId);
		//Display the student
		System.out.println(newStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		Student tempStudent = new Student("John", "Bom", "gambler1@gmail.com");
		Student tempStudent1 = new Student("Leno", "Bam", "gambler2@gmail.com");
		Student tempStudent2= new Student("Ryan", "Gum", "gambler3@gmail.com");
		Student tempStudent3 = new Student("Mark", "Lum", "gambler4@gmail.com");

		System.out.println("Saving Student....");
		studentDAO.save(tempStudent);
		System.out.println("Saving Student....");
		studentDAO.save(tempStudent1);
		System.out.println("Saving Student....");
		studentDAO.save(tempStudent2);
		System.out.println("Saving Student....");
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student
		System.out.println("Creating a new student");
		Student tempStudent = new Student("Paul", "Gambler", "gambler@gmail.com");

		//save the student
		System.out.println("Saving Student....");
		studentDAO.save(tempStudent);

		//display the student
		System.out.println("Saved student : " + tempStudent.getId());
	}
}
