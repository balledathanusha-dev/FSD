package com.example.fsdp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping("/all")
    public String getCourses() {
        return "All Courses";
    }

    @PostMapping("/add")
    public String addCourse(@RequestBody String course) {
        return "Course Added: " + course;
    }

    @PutMapping("/update/{id}")
    public String updateCourse(@PathVariable int id) {
        return "Course Updated: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable int id) {
        return "Course Deleted: " + id;
    }

    @PatchMapping("/patch/{id}")
    public String patchCourse(@PathVariable int id) {
        return "Course Partially Updated: " + id;
    }
}