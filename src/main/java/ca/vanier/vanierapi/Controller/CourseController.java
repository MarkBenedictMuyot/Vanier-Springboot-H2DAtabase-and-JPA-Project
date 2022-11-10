package ca.vanier.vanierapi.Controller;

import ca.vanier.vanierapi.*;
import ca.vanier.vanierapi.Entity.Course;
import ca.vanier.vanierapi.Service.CourseService;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    public CourseController() {
    }

    // Save operation
    @PostMapping("/course")
    public Course saveCourse(@Valid @RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    // Read operation
    @GetMapping("/course")
    public List<Course> fetchCourseList() {
        return courseService.listCourse();
    }

    // Update operation
    @PutMapping("/course/{id}")
    public Course updateCourse(@RequestBody Course course, @PathVariable("id") Integer courseId) {
        return courseService.updateCourse(course, courseId);
    }

    // Delete operation
    @DeleteMapping("/course/{id}")
    public String deleteCourseById(@PathVariable("id") Integer courseId) {
        courseService.deleteCourseID(courseId);
        return "Deleted Successfully";
    }
}
