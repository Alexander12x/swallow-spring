package io.jovi.swallow.mybatis.service;/**
 * Created by jovi on 16/03/2018.
 */

import io.jovi.swallow.mybatis.domain.Student;

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
 * All rights reserved. 2018-03-16 16:31
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public interface StudentService {
    /**
     * 新增记录
     * @param student
     * @return
     */
    int insert(Student student);
    /**
     * 根据班级名称查询
     * @param className
     * @return
     */
    List<Student> findStudentByClassName(String className);
    /**
     * 查询所有的学生
     * @return
     */
    List<Student> queryList();
}
