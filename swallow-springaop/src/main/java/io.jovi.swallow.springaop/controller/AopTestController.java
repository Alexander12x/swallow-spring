package io.jovi.swallow.springaop.controller;/**
 * Created by jovi on 22/02/2018.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
 * All rights reserved. 2018-02-22 12:03
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
@RequestMapping("/aop")
public class AopTestController {

    @GetMapping("/testBeforeService")
    public String testBeforeService(String key,String value){
        return "key="+key+"  value="+value;
    }

    @GetMapping("/testAfterReturning")
    public String testAfterReturning(String key){
        return "key=: "+key;
    }

    @GetMapping("/testAfterReturning01")
    public Integer testAfterReturning01(Integer key){
        return key;
    }

    @GetMapping("/testAfterThrowing")
    public String testAfterThrowing(String key){
        throw new NullPointerException();
    }

    @GetMapping("/testAfter")
    public String testAfter(String key){
        throw new NullPointerException();
    }

    @GetMapping("/testAfter02")
    public String testAfter02(String key){
        return key;
    }

    @GetMapping("/testAroundService")
    public String testAroundService(String key){
        return "环绕通知："+key;
    }
}
