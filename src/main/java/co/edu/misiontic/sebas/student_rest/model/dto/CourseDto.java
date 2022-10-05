package co.edu.misiontic.sebas.student_rest.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {

    private Long id;
    private String name;
    private int modules;
    private int credits;
    private double fee;

    private List<StudentDto> students ;
}