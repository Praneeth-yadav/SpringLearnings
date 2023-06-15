package com.ep.demo.student;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    public List<Student> getStudent(){
        return List.of(
               new Student((long) 1,
                       "maria",
                       "maria@gmail.com",
                       LocalDate.of(2000, Month.JANUARY,12),
                       24)
        );
    }
}
