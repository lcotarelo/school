package co.edu.misiontic.sebas.student_rest.model.mapper;
import org.mapstruct.Mapper;
import co.edu.misiontic.sebas.student_rest.model.Course;
import co.edu.misiontic.sebas.student_rest.model.dto.CourseDto;

@Mapper
public interface ICourseMapper {

    Course mapCourseDTOToCourse(CourseDto courseDto);
    CourseDto mapCourseToCourseDTO(Course course);
}