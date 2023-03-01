package kg.kubatbekov.task_23.service;

import kg.kubatbekov.task_23.dao.CourseDAOImplementation;
import kg.kubatbekov.task_23.model.Course;
import kg.kubatbekov.task_23.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseDAOImplementation courseDAOImplementation;

    @Autowired
    public CourseService(CourseDAOImplementation courseDAOImplementation) {
        this.courseDAOImplementation = courseDAOImplementation;
    }
    public boolean removeStudent(int course_id, int student_id) {
        return courseDAOImplementation.deleteStudent(course_id,student_id);
    }

    public List<Student> findAllStudents(String courseName) {
        return courseDAOImplementation.findAllStudents(courseName);
    }

    public boolean addStudent(int course_id, int student_id) {
        return courseDAOImplementation.addStudent(course_id, student_id);
    }

    public List<Course> getAll() {
        return courseDAOImplementation.getAll();
    }

    public Course getByName(String name) {
        return courseDAOImplementation.getByName(name);
    }

    public void save(Course course) {
        courseDAOImplementation.save(course);
    }

    public boolean update(Course course) {
        return courseDAOImplementation.update(course);
    }

    public boolean deleteById(int course_id) {
        return courseDAOImplementation.deleteById(course_id);
    }
}
