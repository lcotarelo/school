package co.edu.misiontic.sebas.student_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.student_rest.controller.dto.StudentDto;
import co.edu.misiontic.sebas.student_rest.mapper.IStudentMapper;
import co.edu.misiontic.sebas.student_rest.model.repository.IStudentRepository;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private IStudentRepository studentRepository;

    @GetMapping("/test")
    public List<StudentDto> getAllStudents() {
        var studentList = studentRepository.findAll();
        var response = IStudentMapper.INSTANCE.studentsToStudentDtos(studentList);
        return response;
    }

    // @GetMapping("/single")
    // public StudentDto getStudent() {
    // var studentList = studentRepository.findById((long) 1);
    // var response = IStudentMapper.INSTANCE.(studentList);
    // return response;
    // }
}
