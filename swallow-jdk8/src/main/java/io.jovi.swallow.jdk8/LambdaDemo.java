package io.jovi.swallow.jdk8;/**
 * Created by jovi on 19/02/2018.
 */

import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>
 * Title:Lambda表达式
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-19 16:19
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class LambdaDemo {
    /**
     * lambda表达式语法
     * (params) -> expression
     * (params) -> statement
     * (params) -> { statements }
     * eg：
     * () -> System.out.println("Hello Lambda Expressions");
     * (int even, int odd) -> even + odd
     *
     */
    public static void main(String[] args) {
        list();
    }

    private static void thread(){
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
    }

    private static void list(){
        List<Integer> list = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(e -> {
            System.out.println("方式一："+e);
            System.out.println("----------");
        });
    }
}
