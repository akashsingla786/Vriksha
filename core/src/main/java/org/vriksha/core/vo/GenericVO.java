package org.vriksha.core.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.vriksha.core.entity.Student;
import org.vriksha.core.entity.Teacher;

@JsonIgnoreProperties
public class GenericVO {

    private Student student;
    private Teacher teacher;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
