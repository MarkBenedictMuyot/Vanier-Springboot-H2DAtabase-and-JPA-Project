package ca.vanier.vanierapi.Controller;

import ca.vanier.vanierapi.*;
import ca.vanier.vanierapi.Entity.Student;
import ca.vanier.vanierapi.Service.StudentService;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController() {
    }

    // Save operation
    @PostMapping("/students")
    public Student saveStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Read operation
    @GetMapping("/students")
    public List<Student> fetchDepartmentList() {
        return studentService.listStudent();
    }

    // Update operation
    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Integer studentId) {
        return studentService.updateStudent(student, studentId);
    }

    // Delete operation
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") Integer studentId) {
        studentService.deleteStudentID(studentId);
        return "Deleted Successfully";
    }
}
