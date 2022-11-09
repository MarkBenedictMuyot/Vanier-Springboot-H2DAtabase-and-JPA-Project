package ca.vanier.vanierapi.Service;

import java.util.List;
import ca.vanier.vanierapi.Entity.Course;

public interface CourseService {
    // save
    Course saveCourse(Course course);

    // read
    List<Course> listCourse();

    // update
    Course updateCourse(Course course, Integer courseID);

    // delete
    void deleteCourseID(Integer courseID);
}
