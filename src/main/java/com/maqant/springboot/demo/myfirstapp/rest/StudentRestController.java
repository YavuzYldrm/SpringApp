package com.maqant.springboot.demo.myfirstapp.rest;

import com.maqant.springboot.demo.myfirstapp.entity.NewStudent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define endpoint //students - return a list of students
    private List<NewStudent> theStudents;

    //add path parameter for studentId
    @GetMapping("/students/{studentId}")
    public NewStudent getStudents(@PathVariable int studentId) {
        return null;
    }
}
