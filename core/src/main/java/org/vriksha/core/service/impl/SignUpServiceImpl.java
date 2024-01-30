package org.vriksha.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.vriksha.core.dao.StudentDAO;
import org.vriksha.core.dao.TeacherDAO;
import org.vriksha.core.entity.Person;
import org.vriksha.core.entity.Student;
import org.vriksha.core.entity.Teacher;
import org.vriksha.core.service.SignUpService;
import org.vriksha.core.vo.GenericVO;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    StudentDAO studentDAO;

    @Autowired
    TeacherDAO teacherDAO;

    @Override
    public GenericVO signUp(GenericVO genericVO) {
        if (!ObjectUtils.isEmpty(genericVO.getStudent())) {
            Student student = new Student();
            populatePersonEntity(student, genericVO.getStudent());
            populateStudentEntity(student,genericVO.getStudent());
            student = studentDAO.save(student);
            genericVO.setStudent(student);
        } else if (!ObjectUtils.isEmpty(genericVO.getTeacher())) {
            Teacher teacher = new Teacher();
            populatePersonEntity(teacher, genericVO.getTeacher());
            populateTeacherEntity(teacher, genericVO.getTeacher());
            teacher = teacherDAO.save(teacher);
            genericVO.setTeacher(teacher);
        }
        return genericVO;
    }

    private void populatePersonEntity(Person person, Person payloadPerson) {
       person.setAddress(payloadPerson.getAddress());
       person.setDob(payloadPerson.getDob());
       person.setName(payloadPerson.getName());
       person.setEmail(payloadPerson.getEmail());
       person.setBloodGroup(payloadPerson.getBloodGroup());
       person.setCountryCode(payloadPerson.getCountryCode());
       person.setGender(payloadPerson.getGender());
       person.setPassword(payloadPerson.getPassword());
       person.setPhoneNumber(payloadPerson.getPhoneNumber());
       person.setRole(payloadPerson.getRole());
    }

    private static void populateStudentEntity(Student student, Student payloadStudent) {
        student.setSection(payloadStudent.getSection());
        student.setSchoolClass(payloadStudent.getSchoolClass());
        student.setSchoolRollNumber(payloadStudent.getSchoolRollNumber());
    }

    private static void populateTeacherEntity(Teacher teacher, Teacher payloadTeacher) {
        teacher.setSection(payloadTeacher.getSection());
        teacher.setSchoolClass(payloadTeacher.getSchoolClass());
    }

}
