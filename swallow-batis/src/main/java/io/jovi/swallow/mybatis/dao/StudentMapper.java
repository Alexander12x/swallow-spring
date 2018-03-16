package io.jovi.swallow.mybatis.dao;

import io.jovi.swallow.mybatis.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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

}
