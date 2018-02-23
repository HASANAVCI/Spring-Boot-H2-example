package com.example.uygulama.controller;

import com.example.uygulama.model.Lesson;
import com.example.uygulama.model.Student;
import com.example.uygulama.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    List<Student> student() {
        return studentService.get();
    }

    /**
     * @param student
     * @return
     */
    @RequestMapping(value = "/in", method = RequestMethod.POST)
    public Student post(@RequestBody Student student) {
        return studentService.save(student);
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Student idpost(@PathVariable Long id) {
        return studentService.byId(id);

    }

    /**
     * @param hours
     * @return
     */
    @GetMapping("/search/{hours}")
    List<Student> search(@PathVariable int hours) {
        return studentService.searchByHours(hours);
    }


}
