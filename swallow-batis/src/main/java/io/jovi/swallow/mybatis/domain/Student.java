package io.jovi.swallow.mybatis.domain;/**
 * Created by jovi on 15/03/2018.
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-03-15 16:08
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
public class Student {
    /**
     * 物理主键
     */
    private Long id;

    /**
     * 学号
     */
    private String stuNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}
