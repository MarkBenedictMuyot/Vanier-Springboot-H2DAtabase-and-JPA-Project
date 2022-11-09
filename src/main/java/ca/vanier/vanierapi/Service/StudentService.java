package ca.vanier.vanierapi.Service;

import java.util.List;
import ca.vanier.vanierapi.Entity.Student;

public interface StudentService {
    // save
    Student saveStudent(Student student);
    // read
    List<Student> listStudent();
    // update
    Student updateStudent(Student student, Integer studentID);
    // delete
    void deleteStudentID(Integer studentID);
}
