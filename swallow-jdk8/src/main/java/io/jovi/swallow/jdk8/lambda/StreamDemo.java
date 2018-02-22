package io.jovi.swallow.jdk8.lambda;/**
 * Created by jovi on 19/02/2018.
 */

import com.google.common.collect.Lists;

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
 * All rights reserved. 2018-02-19 16:23
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
        System.out.println("求和：" + nums
                .stream()//转成Stream
                .filter(team -> team != null)//过滤
                .distinct()//去重
                .mapToInt(num -> num * 2)//map操作
                .skip(2)//跳过前2个元素
                .limit(4)//限制取前4个元素
                .peek(System.out::println)//流式处理对象函数
                .sum());//
    }
}
