package org.vriksha.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vriksha.core.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}