package io.jovi.swallow.mybatis.domain;/**
 * Created by jovi on 16/03/2018.
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
 * All rights reserved. 2018-03-16 15:01
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
public class Classes {
    /**
     * 物理主键
     */
    private Long id;
    /**
     * 班级名称
     */
    private String name;
}
