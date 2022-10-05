package co.edu.misiontic.sebas.student_rest.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import co.edu.misiontic.sebas.student_rest.model.dto.StudentDto;
import co.edu.misiontic.sebas.student_rest.model.Student;

@Mapper
public interface IStudentMapper {

    IStudentMapper I_STUDENT_MAPPER = Mappers.getMapper(IStudentMapper.class);
    @Mappings({
        @Mapping(target = "courses", source = "student.courses")
    })
    StudentDto studentToStudentDTO(Student student);
    @Mappings({
        @Mapping(target = "courses", source = "student.courses")
    })
    Student studentToStudentDTO (StudentDto studentDto);
}