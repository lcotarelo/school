package co.edu.misiontic.sebas.student_rest.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.misiontic.sebas.student_rest.controller.dto.StudentDto;
import co.edu.misiontic.sebas.student_rest.model.entity.Student;

@Mapper
public interface IStudentMapper {

    IStudentMapper INSTANCE = Mappers.getMapper(IStudentMapper.class);

    List<StudentDto> studentsToStudentDtos(List<Student> student);
}