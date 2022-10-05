package co.edu.misiontic.sebas.student_rest.model.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<CourseDto> courses;

    public StudentDto() {
    }

    public StudentDto(Long id, String firstName, String lastName, String email, List<CourseDto> courses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CourseDto> getcourses() {
        return courses;
    }

    public void setcourses(List<CourseDto> courses) {
        this.courses = courses;
    }

}