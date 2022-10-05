package co.edu.misiontic.sebas.student_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.student_rest.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}