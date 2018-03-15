package com.example.uygulama.service;

import com.example.uygulama.model.Lesson;
import com.example.uygulama.model.Student;
import com.example.uygulama.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class LessonService {

    @Autowired
    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<Lesson> get() {
        return lessonRepository.findAll();
    }

    public List<Student> searchByHours(@RequestParam int hours) {
        return lessonRepository.findByHours(hours);
    }
}
