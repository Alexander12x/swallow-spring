package io.jovi.swallow.mybatis.controller;/**
 * Created by jovi on 16/03/2018.
 */

import io.jovi.swallow.mybatis.domain.Student;
import io.jovi.swallow.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-03-16 17:04
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/save", method = RequestMethod.GET)
    public Student save() {
        Student student = new Student();
        student.setStuNo("STU001");
        student.setName("jovi");
        student.setAge(10);
        studentService.insert(student);
        return student;
    }
}
