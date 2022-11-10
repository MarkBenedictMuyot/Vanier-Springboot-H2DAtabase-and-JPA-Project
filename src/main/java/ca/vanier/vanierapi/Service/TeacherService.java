package ca.vanier.vanierapi.Service;

import java.util.List;
import ca.vanier.vanierapi.Entity.Teacher;

public interface TeacherService {
    // save
    Teacher saveTeacher(Teacher teacher);

    // read
    List<Teacher> listTeacher();

    // update
    Teacher updateTeacher(Teacher teacher, Integer teacherId);

    // delete
    void deleteTeacherID(Integer teacherId);


}
