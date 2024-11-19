package Service;

import DAO.SubjectRepository;
import Model.Subject;

import java.util.List;

public class SubjectService {
    private SubjectRepository subjectRepository = new SubjectRepository();

    public List<Subject> getAllSubjects() {
        return subjectRepository.getAllSubjects();
    }

    public void addSubject(Subject subject) {
        subjectRepository.addSubject(subject);
    }

    public void updateSubject(Subject subject) {
        subjectRepository.updateSubject(subject);
    }

    public void deleteSubject(int id) {
        subjectRepository.deleteSubject(id);
    }
}

