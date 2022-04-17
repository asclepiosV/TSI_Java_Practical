package com.isep.practical4.ex3;

import com.isep.practical4.ex2.Book;
import com.isep.practical4.ex2.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;


    @GetMapping(path = "/*")
    public ResponseEntity<String> error() {
        return new ResponseEntity<>("<h1>Error 404</h1>" +
                "<a href=\"/getCourses\">Get all courses</a>", HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/getCourses")
    public ResponseEntity<Iterable<Course>> getCourses() {
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getCourse")
    public ResponseEntity<Optional<Course>> getCourse(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id) {
        return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/getSchedule")
    public ResponseEntity<Iterable<Schedule>> getSchedule() {
        return new ResponseEntity<>(scheduleRepository.findAll(), HttpStatus.OK);
    }


}

