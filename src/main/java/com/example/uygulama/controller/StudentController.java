package com.example.uygulama.controller;

import com.example.uygulama.model.Student;
import com.example.uygulama.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    ResponseEntity<List<Student>> student() {
        return new ResponseEntity<>(studentService.get(), HttpStatus.OK);
    }

    /**
     * @param student
     * @return
     */
    @RequestMapping(value = "/in", method = RequestMethod.POST)
    public Student post(@RequestBody Student student) {
        return studentService.saved(student);

    }

    /**
     * @param id
     * @return
     */


    @GetMapping("/{id}")
    public Student idpost(@PathVariable Long id) {
        return studentService.byId(id);

    }
}
