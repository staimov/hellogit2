package com.staimov.hellogit.controller;

import com.staimov.hellogit.json.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Paul", "Atreides"));
        students.add(new Student("Alia", "Atreides"));
        students.add(new Student("Lisa", "Simpson"));

        return students;
    }
}
