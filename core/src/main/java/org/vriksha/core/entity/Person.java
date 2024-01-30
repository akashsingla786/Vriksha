package org.vriksha.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vrikshaId;

    private String name;

    private String gender;
    private String bloodGroup;
    private Date dob;
    private Long phoneNumber;
    private String countryCode;
    private String email;
    private String address;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "roleId")
    private Role role;
    private String password;
}
