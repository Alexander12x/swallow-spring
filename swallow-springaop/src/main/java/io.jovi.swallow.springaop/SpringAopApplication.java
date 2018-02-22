package io.jovi.swallow.springaop;/**
 * Created by jovi on 21/02/2018.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Title: 通过spring aop 进行通知
 * </p>
 * <p>
 * Description: 这里的涉及的通知类型有：前置通知、后置最终通知、后置返回通知、后置异常通知、环绕通知，下面我们就具体的来看一下怎么在SpringBoot中添加这些通知。
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * All rights reserved. 2018-02-21 16:02
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SpringAopApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }
}
