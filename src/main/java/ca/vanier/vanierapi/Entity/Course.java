package ca.vanier.vanierapi.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.ArrayList;

@Entity
@Table
public class Course {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String courseName;
    
    @OneToOne
    @JoinColumn(name = "teacher_ID", referencedColumnName = "id")
    Teacher teacher;
    @Column
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "students_ID", referencedColumnName = "id")
    List<Student> students = new ArrayList<>();

    public Course(int id, String courseName, Teacher teacher, List<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", courseName=" + courseName + ", teacher=" + teacher + ", students=" + students
                + "]";
    }

}
