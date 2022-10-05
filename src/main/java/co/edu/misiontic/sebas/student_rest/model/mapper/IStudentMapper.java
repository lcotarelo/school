package co.edu.misiontic.sebas.student_rest.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.misiontic.sebas.student_rest.model.dto.StudentDto;
import co.edu.misiontic.sebas.student_rest.model.Student;

@Mapper
public interface IStudentMapper {

    StudentDto studentToStudentDTO(Student student);
    Student studentToStudentDTO (StudentDto studentDto);
}