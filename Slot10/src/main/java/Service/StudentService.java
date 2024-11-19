package Service;

import DAO.StudentRepository;
import Model.Student;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository = new StudentRepository();

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentRepository.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }
}

