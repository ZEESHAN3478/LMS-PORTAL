package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo; // Spelling theek kar di gayi hai

    @Autowired
    private CourseRepository courseRepo;

    @Override
    public void run(String... args) throws Exception {

        // 1000 Students add karne ka sahi loop
        for (int i = 1; i <= 100; i++) {
            User student = new User();
            student.setName("Student " + i);
            student.setEmail("2026-CS-" + i + "@usindh.edu.pk");
            student.setRole("STUDENT");
            userRepo.save(student);
        }

        System.out.println("100 Students successfully added to database!");

        // Sample Course
        Course c1 = new Course();
        c1.setTitle("Data Structures");
        c1.setTeacherName("Dr. Ahmed");
        courseRepo.save(c1);
    }
}