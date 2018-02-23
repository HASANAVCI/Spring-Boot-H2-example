package com.example.uygulama.service;

import com.example.uygulama.model.Student;
import com.example.uygulama.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }

    //GET
    public List<Student> get() {
        return studentRepository.findAll();
    }

    //POST
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student byId(Long id) {
        return studentRepository.findOne(id);
    }

    public List<Student> searchByHours(@RequestParam int hours) {
        return studentRepository.findByHours(hours);
    }
}

