package org.vriksha.core.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vriksha.core.entity.Student;
import org.vriksha.core.repository.StudentRepository;

@Repository
public class StudentDAO {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentDAO(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
}