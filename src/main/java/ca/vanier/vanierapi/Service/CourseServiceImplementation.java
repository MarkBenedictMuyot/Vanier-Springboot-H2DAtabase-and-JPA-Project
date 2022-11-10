package ca.vanier.vanierapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.vanierapi.Entity.Course;
import ca.vanier.vanierapi.Repository.CourseRepository;
import java.util.Objects;

@Service
public class CourseServiceImplementation implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    // save course obj to courserepo
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);

    }

    // return list of courses from courserepo
    @Override
    public List<Course> listCourse() {

        return (List<Course>) courseRepository.findAll();
    }

    // delete course in the course repo by ID
    @Override
    public void deleteCourseID(Integer courseID) {
        courseRepository.deleteById(courseID);
    }

    // ________________________________________________________________________________
    // update course in the courserepo
    @Override
    public Course updateCourse(Course course, Integer courseID) {
        Course courseDB = courseRepository.findById(courseID).get();

        if (Objects.nonNull(course.getCourseName()) && !"".equalsIgnoreCase(course.getCourseName())) {
            courseDB.setCourseName(course.getCourseName());
            courseDB.setTeacher(course.getTeacher());
        }

        return courseRepository.save(courseDB);
    }

}
