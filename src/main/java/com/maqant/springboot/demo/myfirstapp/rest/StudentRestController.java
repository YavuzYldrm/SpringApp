package com.maqant.springboot.demo.myfirstapp.rest;

import javax.annotation.PostConstruct;

import com.maqant.springboot.demo.myfirstapp.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define endpoint //students - return a list of students
    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Arthur", "Archer","test@gmail.com"));
        theStudents.add(new Student("Mario", "Gomez","test@gmail.com"));
        theStudents.add(new Student("Jake", "Ryan","test@gmail.com"));

    }

    @GetMapping("/students")
    public List<Student> getTheStudents(){
        return theStudents;
    }


    //add path parameter for studentId
    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId) {

        if( (studentId >= theStudents.size() || (studentId<0))) {
            throw new StudentNotFoundException("Student Not Found!" + studentId);
        }
        return theStudents.get(studentId);
    }

    //Add exception handler using @Exception Handler


}
