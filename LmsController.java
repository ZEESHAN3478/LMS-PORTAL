package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lms")
public class LmsController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private CourseRepository courseRepo;

    // URL: http://localhost:8080/api/lms/users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // URL: http://localhost:8080/api/lms/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
}