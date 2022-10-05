package co.edu.misiontic.sebas.student_rest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.student_rest.model.entity.Course;

public interface ICourseRepository extends JpaRepository<Course, Long> {

}
