package ca.vanier.vanierapi.Controller;

import ca.vanier.vanierapi.*;
import ca.vanier.vanierapi.Entity.Teacher;
import ca.vanier.vanierapi.Service.TeacherService;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    public TeacherController() {

    }

    // Save operation
    @PostMapping("/teachers")
    public Teacher saveTeacher(@Valid @RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    // Read operation
    @GetMapping("/teachers")
    public List<Teacher> fetchDepartmentList() {
        return teacherService.listTeacher();
    }

    // Update operation
    @PutMapping("/teachers/{id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable("id") Integer teacherId) {
        return teacherService.updateTeacher(teacher, teacherId);
    }

    // Delete operation
    @DeleteMapping("/teachers/{id}")
    public String deleteTeacherById(@PathVariable("id") Integer teacherId) {
        teacherService.deleteTeacherID(teacherId);
        return "Deleted Successfully";
    }
}