package io.jovi.swallow.mybatis.controller;/**
 * Created by jovi on 16/03/2018.
 */

import com.github.pagehelper.PageHelper;
import io.jovi.swallow.mybatis.domain.Student;
import io.jovi.swallow.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/student/get/{className}", method = RequestMethod.GET)
    public List<Student> get(@PathVariable(name = "className") String className) {
       return studentService.findStudentByClassName(className);
    }

    /**
     * 获取学生列表
     * @param start
     * @param size
     * @return
     */
    @GetMapping(value = "list/{start}/{size}")
    public List<Student> getUserList(@PathVariable("start")int start,@PathVariable("size")int size){
        PageHelper.startPage(start,size);
        List<Student> list= studentService.queryList();
        return list;
    }
}
