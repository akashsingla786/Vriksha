package org.vriksha.core.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.vriksha.core.entity.Student;
import org.vriksha.core.entity.Teacher;

@Setter
@Getter
@JsonIgnoreProperties
public class GenericVO {

    private Student student;
    private Teacher teacher;

}
