package ca.vanier.vanierapi.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.vanierapi.Entity.Student;
import ca.vanier.vanierapi.Repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // save Student obj to Studentrepo
    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);

    }

    // return list of Students from Studentrepo
    @Override
    public List<Student> listStudent() {

        return (List<Student>) studentRepository.findAll();
    }

    // delete Student obj in the studentrepo by ID

    @Override
    public void deleteStudentID(Integer studentID) {
        studentRepository.deleteById(studentID);

    }

    // _____________________________________________________________________________

    @Override
    public Student updateStudent(Student student, Integer studentID) {
        Student studentDB = studentRepository.findById(studentID).get();
        if (Objects.nonNull(student.getFirstName())
                && !"".equalsIgnoreCase(
                        student.getFirstName())) {
            studentDB.setFirstName(
                    student.getFirstName());
        }
        if (Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
            studentDB.setLastName(student.getLastName());
        }
        if (Objects.nonNull(student.getEmail())
                && !"".equalsIgnoreCase(
                        student.getEmail())) {
            studentDB.setEmail(
                    student.getEmail());
        }
        return studentRepository.save(studentDB);
    }

}
