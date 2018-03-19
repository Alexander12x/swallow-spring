package io.jovi.swallow.mybatis.dao;

import io.jovi.swallow.mybatis.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户
 */
@Mapper
@Repository
public interface StudentMapper {

    /**
     * 新增记录
     *
     * @param student
     * @return
     */
    @Insert({
            "insert into swallow_student (stu_no,name,age)",
            "values (#{stuNo,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})"
    })
    int insert(Student student);

    /**
     * 根据班级名称查询
     * @param className
     * @return
     */
    @Select("select * from swallow_student student where id in (select attend.student_id from swallow_attend attend left join swallow_classes classes on classes.id = attend.class_id where classes.name = #{className})")
    @Results({
            @Result(property="id",column="id"),
            @Result(property="stuNo",column="stu_no"),
            @Result(property="name",column="name"),
            @Result(property="age",column="age")
    })
    List<Student> findStudentByClassName(String className);

}
