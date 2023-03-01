package kg.kubatbekov.task_23.service;

import kg.kubatbekov.task_23.dao.StudentDAOImplementation;
import kg.kubatbekov.task_23.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDAOImplementation studentDAOImplementation;

    @Autowired
    public StudentService(StudentDAOImplementation studentDAOImplementation) {
        this.studentDAOImplementation = studentDAOImplementation;
    }

    public void save(Student student) {
        studentDAOImplementation.save(student);
    }

    public boolean update(Student student) {
        return studentDAOImplementation.update(student);
    }

    public Student getByName(String name) {
        return studentDAOImplementation.getByName(name);
    }

    public List<Student> getAll() {
        return studentDAOImplementation.getAll();
    }

    public boolean deleteById(int student_id) {
        return studentDAOImplementation.deleteById(student_id);
    }
}
