package ca.vanier.vanierapi.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.vanierapi.Entity.Teacher;
import ca.vanier.vanierapi.Repository.TeacherRepository;

@Service
public class TeacherServiceImplementation implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    // save Teacher obj to Teacherrepo
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        return teacherRepository.save(teacher);
    }

    // list teacher from teacher repo
    @Override
    public List<Teacher> listTeacher() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    // find id then delete from teacher repo
    @Override
    public void deleteTeacherID(Integer teacherID) {
        teacherRepository.deleteById(teacherID);

    }

    @Override
    public Teacher updateteacher(Teacher teacher, Integer teacherID) {
        Teacher teacherDB = teacherRepository.findById(teacherID)
        .get();
        if (Objects.nonNull(teacher.getFirstName())
                && !"".equalsIgnoreCase(
                       teacher.getFirstName())) {
            teacherDB.setFirstName(
                    teacher.getFirstName());
        }
        if (Objects.nonNull(teacher.getLastName())
                && !"".equalsIgnoreCase(
                        teacher.getLastName())) {
            teacherDB.setLastName(
                    teacher.getLastName());
        }
        if (Objects.nonNull(teacher.getEmail())
                && !"".equalsIgnoreCase(
                        teacher.getEmail())) {
            teacherDB.setEmail(
                    teacher.getEmail());
        }
        return teacherRepository.save(teacherDB);
    }

}
