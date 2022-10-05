package co.edu.misiontic.sebas.student_rest.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.student_rest.model.dto.StudentDto;
import co.edu.misiontic.sebas.student_rest.model.mapper.IStudentMapper;
import co.edu.misiontic.sebas.student_rest.repository.IStudentRepository;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private IStudentRepository studentRepository;

    private IStudentMapper iStudentMapper;

    @GetMapping("/test")
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map( student -> iStudentMapper.studentToStudentDTO(student))
                .collect(Collectors.toList());
    }

    // @GetMapping("/single")
    // public StudentDto getStudent() {
    // var studentList = studentRepository.findById((long) 1);
    // var response = IStudentMapper.INSTANCE.(studentList);
    // return response;
    // }
}