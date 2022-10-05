package co.edu.misiontic.sebas.student_rest.model.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import co.edu.misiontic.sebas.student_rest.model.Course;
import co.edu.misiontic.sebas.student_rest.model.dto.CourseDto;

@Mapper
public interface ICourseMapper {

    ICourseMapper I_COURSE_MAPPER = Mappers.getMapper(ICourseMapper.class);

    Course mapCourseDTOToCourse(CourseDto courseDto);
    @Mappings({
        @Mapping(target = "students", source = "courseDTO.students")
    }
    )
    CourseDto mapCourseToCourseDTO(Course course);
}