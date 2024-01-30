package org.vriksha.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "vrikshaId")
    private Person person;

    private Long schoolRollNumber;
    private String schoolClass;
    private String section;

}
