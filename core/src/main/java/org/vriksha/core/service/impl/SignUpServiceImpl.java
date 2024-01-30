package org.vriksha.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.vriksha.core.dao.StudentDAO;
import org.vriksha.core.entity.Student;
import org.vriksha.core.entity.Teacher;
import org.vriksha.core.service.SignUpService;
import org.vriksha.core.vo.GenericVO;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    StudentDAO studentDAO;
    @Override
    public GenericVO signUp(GenericVO genericVO) {
        if(!ObjectUtils.isEmpty(genericVO.getStudent())){
            Student student=new Student();
            Student payloadStudent = genericVO.getStudent();
            populateStudentEntity(student, payloadStudent);
            student = studentDAO.save(student);
            genericVO.setStudent(student);
        }
        else if(!ObjectUtils.isEmpty(genericVO.getTeacher())){
            Teacher teacher=new Teacher();
            Teacher payloadTeacher = genericVO.getTeacher();
        }
        return genericVO;
    }

    private static void populateStudentEntity(Student student, Student payloadStudent) {
        student.setAddress(payloadStudent.getAddress());
        student.setDob(payloadStudent.getDob());
        student.setSection(payloadStudent.getSection());
        student.setName(payloadStudent.getName());
        student.setEmail(payloadStudent.getEmail());
        student.setSchoolClass(payloadStudent.getSchoolClass());
        student.setSchoolRollNumber(payloadStudent.getSchoolRollNumber());
        student.setBloodGroup(payloadStudent.getBloodGroup());
        student.setCountryCode(payloadStudent.getCountryCode());
        student.setGender(payloadStudent.getGender());
        student.setPassword(payloadStudent.getPassword());
        student.setPhoneNumber(payloadStudent.getPhoneNumber());
        student.setRole(payloadStudent.getRole());
    }
}
