package org.vriksha.core.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vriksha.core.entity.Student;
import org.vriksha.core.entity.Teacher;
import org.vriksha.core.repository.StudentRepository;
import org.vriksha.core.repository.TeacherRepository;

@Repository
public class TeacherDAO {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherDAO(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}